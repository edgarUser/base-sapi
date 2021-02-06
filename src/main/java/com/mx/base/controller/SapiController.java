package com.mx.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sapi")
public class SapiController {

	@GetMapping("/data")
	public String getData() {
		return "data";
	}

}
