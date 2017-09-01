package com.htdf.heating.mapper;

import com.htdf.heating.model.SysUser;

public interface SysUserMapper {
	
	SysUser findByUsername(String username);
}
