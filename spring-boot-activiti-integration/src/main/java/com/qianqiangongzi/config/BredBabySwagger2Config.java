package com.qianqiangongzi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class BredBabySwagger2Config {
	@Value("${swagger.show:false}")
	private boolean swaggerShow;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).enable(swaggerShow).select()
				.apis(RequestHandlerSelectors.basePackage("com.qianqiangongzi")).paths(PathSelectors.any()).build();
	}

}
