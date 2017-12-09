package com.vdong.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vdong.dao.SystemCodeDao;
import com.vdong.services.SystemCodeService;

import com.vdong.bean.Attach;

@Service("systemCodeService")
public class SystemCodeServiceImpl implements SystemCodeService {
	@Autowired
	private SystemCodeDao systemCodeDao;

	@Override
	public List getList(String dmlb, String dmz) {
		return systemCodeDao.getList(dmlb, dmz);
	}

	@Override
	public int deleteAttach(String id) {
		return systemCodeDao.deleteAttach(id);
	}

	@Override
	public List getAttach(Map<String, String> map) {
		return systemCodeDao.getAttach(map);
	}

	@Override
	public int saveAttach(Attach attach) {
		return systemCodeDao.saveAttach(attach);
	}

	@Override
	public int updateAttach(Attach attach) {
		return systemCodeDao.updateAttach(attach);
	}

}
