package com.qianqiangongzi;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class StartSuccessRanner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------启动成功（"
				+ new SimpleDateFormat("yyyy-MM-dd mm:hh:ss").format(new Date()) + "）------------------------");
	}

}
