package com.vdong.util;

import java.util.List;

import com.vdong.db.DBManager;

public class JdbcUtil {

	public String test() {
		String sql = "   select * from hotelowner    where  account not  in (select account from  hoteluser)";

		DBManager db = new DBManager();
		List list = db.find(sql);
		if (null != list && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				
		}

		}

		return null;

	}

}
