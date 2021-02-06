package com.mx.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.base.model.Data;
import com.mx.base.service.DataService;

@RestController
@RequestMapping("/sapi")
public class SapiController {

	@Autowired
	private DataService dataService;

	@GetMapping("/data")
	public Data getData() {
		return dataService.getData();
	}

}
