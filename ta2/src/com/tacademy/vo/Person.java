package com.tacademy.vo;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 5758376105545368603L;
	
	private String name;
	private String address;
	private String age;
	private String tel;
	
	public Person(){}
	
	public Person(String name, String address, String age, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + ", tel=" + tel + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}


}
