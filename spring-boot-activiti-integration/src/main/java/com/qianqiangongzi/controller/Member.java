package com.qianqiangongzi.controller;

/**
 * 会员实体
 * 
 * @author 谦谦公子爱编程
 *
 */
public class Member {
	private String name; // 名称
	private int age;// 年龄

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Member() {
	}

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}