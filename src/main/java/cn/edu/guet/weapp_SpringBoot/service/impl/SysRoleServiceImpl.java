package cn.edu.guet.weapp_SpringBoot.service.impl;

import java.util.List;

import cn.edu.guet.weapp_SpringBoot.bean.SysRole;
import cn.edu.guet.weapp_SpringBoot.mapper.SysRoleMapper;
import cn.edu.guet.weapp_SpringBoot.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Liwei
 * @Date 2021-08-13 18:12
 */
@Service
public class SysRoleServiceImpl  implements SysRoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;

	@Override
	public List<SysRole> findAll() {
		return sysRoleMapper.findAll();
	}
	
}
