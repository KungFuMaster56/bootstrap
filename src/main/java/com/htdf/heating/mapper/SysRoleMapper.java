package com.htdf.heating.mapper;

import java.util.List;

import com.htdf.heating.model.SysRole;

public interface SysRoleMapper {
	
	List<SysRole> findRolesByUserid(Integer userId);
}
