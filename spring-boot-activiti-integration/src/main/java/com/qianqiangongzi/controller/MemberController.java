package com.qianqiangongzi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = { "会员接口" })
@RestController
@RequestMapping(value = "/api/v1/member")
public class MemberController {

	@ApiOperation(value = "测试访问")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Member test() {
		System.out.println("test");

		Member member = new Member("谦谦公子爱编程", 21);

		return member;
	}
}
