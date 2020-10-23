package com.bp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bp.dto.BusProviderDto;
import com.bp.dto.MatchedJourneyDto;
import com.bp.form.PlanTravelForm;
import com.bp.service.BusProvidersService;
import com.bp.service.TravelService;

@Controller
@RequestMapping("/plan-travel.htm")
public class BusProvidersController {
	@Autowired
	BusProvidersService  busProvidersService;
	@Autowired
	TravelService travelService;
	@GetMapping
	public String showPlanTravelPage(Model model) {
		List<BusProviderDto> providerDtos=null;
		providerDtos=busProvidersService.getBusProviders();
		model.addAttribute("busProviders", providerDtos);
		return "plan-travel";
	}
	@PostMapping
	public String bookPlanTravel(@ModelAttribute("planTravel") PlanTravelForm form,Model model ) {
		List<MatchedJourneyDto>  journeyDtos=null;
		journeyDtos=travelService.getFilterdJourney(form);
		model.addAttribute("journeys", journeyDtos);
		return "journeys";
	}

}
