package com.vdong.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vdong.dao.HotelOwnerDao;
import com.vdong.services.HotelOwnerService;

@Service("hotelOwnerService")
public class HotelOwnerServiceImpl implements HotelOwnerService {

@Autowired
private HotelOwnerDao hotelOwnerDao;

public boolean bindingYz(String phone) {
	return hotelOwnerDao.bindingYz(phone);
}
	
	



}
