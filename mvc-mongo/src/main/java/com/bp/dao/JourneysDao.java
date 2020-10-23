package com.bp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bp.bo.BusProviderBo;
import com.bp.bo.JourneyBo;
import com.bp.bo.TravelCriteriaBo;
@Repository
public class JourneysDao {
	private final String SQL_GET_JOURNEYS_WITH_FILTER="select j.journeys_id, j.source, j.destination, j.travel_dt, j.cost, j.bus_provider_id, j.travel_time_in_hours, b.bus_providers_id, b.buisness_nm, b.association_dt, b.primary_buisness_contact_nbr, b.primary_buisness_email_adress, b.status from journeys j inner join bus_providers b where b.bus_providers_id=j.bus_provider_id order by b.buisness_nm";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<JourneyBo> getJourneysOnCriteria(TravelCriteriaBo criteriaBo){
		return jdbcTemplate.query(SQL_GET_JOURNEYS_WITH_FILTER, new Object[] {}, (rs,rowNo)->{
			JourneyBo journeyBo=null;
			journeyBo=new JourneyBo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getFloat(5), rs.getInt(7),
					new BusProviderBo(rs.getInt(8), rs.getString(9), rs.getDate(10), rs.getString(11), rs.getString(12), rs.getString(13)));
			return journeyBo;
		});
	}

}
