package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import com.example.demo.bai1.DemoApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

}

