package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebapplnApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(WebapplnApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(WebapplnApplication.class, args);
	}

}
