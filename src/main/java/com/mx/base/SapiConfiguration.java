package com.mx.base;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SapiConfiguration {

	public Docket swaggerSapi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.mx.base.controller")).paths(PathSelectors.ant(null))
				.build().apiInfo(new ApiInfoBuilder().version("1.0").title("SAPI")
						.description("Documentation SAPI V1.0").build());
	}

}
