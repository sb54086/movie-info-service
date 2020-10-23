package com.bp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bp.bo.BusProviderBo;
import com.bp.dao.BusProviderDao;
import com.bp.dto.BusProviderDto;
@Component
public class BusProvidersService {
	 @Autowired
	 private BusProviderDao busProviderDao;
	 public List<BusProviderDto> getBusProviders(){
		 List<BusProviderDto> busProviderDtos=null;
		 List<BusProviderBo>  busProviderBos=null;
		 busProviderBos=busProviderDao.getActiveBusProvides();
		 busProviderDtos=new ArrayList<BusProviderDto>();
		 for(BusProviderBo bo:busProviderBos) {
			 busProviderDtos.add(new BusProviderDto(bo.getBusProviderId(), bo.getBuisnessName()));
		 }
		 return busProviderDtos;
	 }

}
