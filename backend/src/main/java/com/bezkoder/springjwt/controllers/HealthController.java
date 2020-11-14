package com.bezkoder.springjwt.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/_ah")
public class HealthController {
	@GetMapping("/start")
	public String allAccess() {
		return "Public Content.";
	}
}
