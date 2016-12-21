package com.tacademy.test;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.tacademy.vo.Person;
import com.tacademy.vo.PersonListResult;

public class PersonTest {
	
	public PersonTest() {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동1",22,"000-9999",true));
		list.add(new Person("홍길동2",23,"000-9999",true));
		list.add(new Person("홍길동3",24,"000-9999",true));
		list.add(new Person("홍길동4",25,"000-9999",true));
		list.add(new Person("홍길동5",26,"000-9999",true));
		
		Gson gson = new Gson();
		//String result = gson.toJson(list);
		//System.out.println(result);
		
		
		PersonListResult personListResult = new PersonListResult();
		personListResult.setCount(list.size());
		personListResult.setList(list);
		personListResult.setStatus("success");
		
		String result = gson.toJson(personListResult);
		System.out.println(result);
		
		/*
		Person person = new Person();
		person.setName("홍길동");
		person.setAge(30);
		person.setSex(true);
		person.setTel("000-9999-9999");
		
		Gson gson = new Gson();
		
		String result = gson.toJson(person);
		System.out.println(result);
		
		Person undo = gson.fromJson(result, Person.class);
		System.out.println(undo);
		*/
		
	}
	
	public static void main(String[] args) {
		new PersonTest();
	}

}
