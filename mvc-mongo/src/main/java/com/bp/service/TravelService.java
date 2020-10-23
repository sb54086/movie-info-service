package com.bp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bp.bo.JourneyBo;
import com.bp.bo.TravelCriteriaBo;
import com.bp.dao.JourneysDao;
import com.bp.dto.MatchedJourneyDto;
import com.bp.form.PlanTravelForm;
@Component
public class TravelService {
	@Autowired
	private JourneysDao journeysDao;
	public List<MatchedJourneyDto> getFilterdJourney(PlanTravelForm form){
		List<MatchedJourneyDto> journeis=null;
		List<JourneyBo> journeyBos=null;
		TravelCriteriaBo criteriaBo=new TravelCriteriaBo(form.getBusProviderNo(), form.getProviderName(), form.getSource(), form.getDestination(), form.getTravelDate(),
				form.getMinPrice(), form.getMaxPrice());
		journeyBos=journeysDao.getJourneysOnCriteria(criteriaBo);
		journeis=new ArrayList<MatchedJourneyDto>();
		for(JourneyBo bo:journeyBos) {
			journeis.add(new MatchedJourneyDto(bo.getBusProviderBo().getBuisnessName(), bo.getBusProviderBo().getPrimaryBuisnessContactNo(), bo.getBusProviderBo().getPrimaryBuisnessEmailAdress(), bo.getCost(), bo.getTimeInHours()));
		}
		return journeis;
		
	}

}
