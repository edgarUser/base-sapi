package com.mx.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mx.base.repository.DataRepository;
import com.mx.base.service.DataService;
import com.mx.base.service.DataServiceImpl;

@SpringBootApplication
public class SapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapiApplication.class, args);
	}

	@Bean
	public DataRepository getDataRepository() {
		return new DataRepository();
	}

	@Bean
	public DataService getDataService() {
		return new DataServiceImpl(getDataRepository());
	}

}
