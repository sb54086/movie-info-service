package com.bp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bp.bo.BusProviderBo;
@Repository
public class BusProviderDao {
	private static final String SQL_GET_BUSPROVIDERS="SELECT b.`bus_providers_id`, b.`buisness_nm`,     b.`association_dt`,     b.`primary_buisness_contact_nbr`,     b.`primary_buisness_email_adress`,     b.`status` FROM bus_providers b";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<BusProviderBo> getActiveBusProvides(){
		return jdbcTemplate.query(SQL_GET_BUSPROVIDERS, (rs,rowNumber)->{
			BusProviderBo busProviderBo=null;
			busProviderBo=new BusProviderBo(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4),
					rs.getString(5), rs.getString(6));
			return busProviderBo;
		});
		
	}
	

}
