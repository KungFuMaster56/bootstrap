package com.htdf.heating.mapper;

import java.util.List;

import com.htdf.heating.model.SysPermission;

public interface SysPermissionMapper {
	
	List<SysPermission> findPermissionsByRoleid(Integer roleId);
}
