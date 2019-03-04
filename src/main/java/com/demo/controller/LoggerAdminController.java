package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggerAdminController {

	@GetMapping("/logger-admin")
	public String loggerAdmin() {
		return "logger-admin";
	}

}
