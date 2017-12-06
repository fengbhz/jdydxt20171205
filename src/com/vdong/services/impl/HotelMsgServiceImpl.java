package com.vdong.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vdong.dao.HotelMsgDao;
import com.vdong.services.HotelMsgService;

@Service("hotelMsgService")
public class HotelMsgServiceImpl implements HotelMsgService {

	@Autowired
	private HotelMsgDao hotelMsgDao;

	public int insertMsg(Map<String, String> map) {
		return hotelMsgDao.insertMsg(map);
	}

	public int updateStatus(String id, String readStatus) {
		return hotelMsgDao.updateStatus(id, readStatus);
	}

	public List getMsg(String type, String str) {
		return hotelMsgDao.getMsg(type, str);
	}

	public int updateMsg(Map<String, String> map) {
		return hotelMsgDao.updateMsg(map);
	}

	public int updateAd(Map<String, String> map) {
		return hotelMsgDao.updateAd(map);
	}

	public int insertAd(Map<String, String> map) {
		return  hotelMsgDao.insertAd(map);
	}

}
