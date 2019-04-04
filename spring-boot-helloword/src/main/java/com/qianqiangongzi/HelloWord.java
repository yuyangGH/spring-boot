package com.qianqiangongzi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员接口
 * 
 * @author 谦谦公子爱编程
 *
 */
@RestController
@RequestMapping(value = "/api/v1/HelloWord")
public class HelloWord {

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		System.out.println("进入sayHello....");
		return "Hello Word";
	}
}
