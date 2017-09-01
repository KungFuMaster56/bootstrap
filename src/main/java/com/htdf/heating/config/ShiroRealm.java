package com.htdf.heating.config;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.htdf.heating.mapper.SysPermissionMapper;
import com.htdf.heating.mapper.SysRoleMapper;
import com.htdf.heating.mapper.SysUserMapper;
import com.htdf.heating.model.SysPermission;
import com.htdf.heating.model.SysRole;
import com.htdf.heating.model.SysUser;

public class ShiroRealm extends AuthorizingRealm{
	
	@Resource
	private SysUserMapper userMapper;
	
	@Resource
	private SysRoleMapper roleMapper;
	
	@Resource
	private SysPermissionMapper permissionMapper;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		SysUser user = (SysUser) principals.getPrimaryPrincipal();
		List<SysRole> sysRoles = roleMapper.findRolesByUserid(user.getId());
		for(SysRole sr : sysRoles){
			authorizationInfo.addRole(sr.getRole());
			List<SysPermission> sysPermissions = permissionMapper.findPermissionsByRoleid(sr.getId());
			for(SysPermission sp : sysPermissions){
				authorizationInfo.addStringPermission(sp.getPermission());
			}
		}
	
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		SysUser user = userMapper.findByUsername(username);
		if(user == null){
			return null;
		}
		SimpleAuthenticationInfo authenticationInfo	= new SimpleAuthenticationInfo(user,user.getPassword(),getName());
		return authenticationInfo;
	}
}
