package cn.itcast.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.oa.dao.RoleDao;
import cn.itcast.oa.domain.Role;
import cn.itcast.oa.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleDao roleDao;
	
	public void delete(Long id) {
		roleDao.delete(id);
	}
	
	public List<Role> findAll() {
		return roleDao.findAll();
	}
}
