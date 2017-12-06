package com.vdong.dao;

public interface HotelOwnerDao {
	/**
	 * 根据手机号码绑定业主
	 * @param phone
	 * @return
	 */
	public boolean bindingYz(String phone);

}
