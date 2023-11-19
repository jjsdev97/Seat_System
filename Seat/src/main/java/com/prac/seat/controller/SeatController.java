package com.prac.seat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.prac.seat.service.SeatService;

@Controller
public class SeatController {
	
	SeatService seatService;
	
	@Autowired
	public SeatController(SeatService seatService) {
		this.seatService = seatService;
	}
	
	@GetMapping("")
	public String main() {
		
		return "main";
	}
	
	@GetMapping("addSeat")
	public String addSeatView() {
		return "addSeat";
	}

}
