package com.vdong.dao.impl;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vdong.dao.HotelOwnerDao;

@Repository("hotelOwnerDao")
public class HotelOwnerDaoImpl implements HotelOwnerDao {
	private Logger logger = Logger.getLogger(HotelOwnerDaoImpl.class);
	private JdbcTemplate jdbc;

	public void setDataSource(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public JdbcTemplate getJdbc() {
		return this.jdbc;
	}

	public boolean bindingYz(String phone) {
		String        sql = " update  hotelowner set  applystatus=3  where  (applystatus=2  or applystatus=3 or applystatus=1)  and  mobile=?  ";
		String sql_status = " update  hoteluser  set  userkind ='1'  where mobile=?  ";  //  更新用户为业主
		int count = 0;
		try {
			count = jdbc.update(sql, new Object[] { phone });
			 if(count>0){
				 jdbc.update(sql_status, new Object[] { phone });
			   }
		} catch (Exception e) {
			logger.info("bindingYz---->"+e.getMessage());
			e.printStackTrace();
		}
		if (count < 1) {
			return false;
		}
		return true;
	}
}
