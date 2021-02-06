package com.mx.base.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.mx.base.model.Data;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GeDataTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void getData() {
		ResponseEntity<Data> entity = this.restTemplate.getForEntity("/sapi/data", Data.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
