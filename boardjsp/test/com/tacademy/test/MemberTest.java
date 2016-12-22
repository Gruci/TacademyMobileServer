package com.tacademy.test;

import com.tacademy.board.dao.MemberDAO;
import com.tacademy.board.vo.Member;

public class MemberTest {

	public MemberTest() {
		MemberDAO dao = new MemberDAO();
		Member vo = new Member();
		vo.setId("aaa");
		vo.setPassword("aaa");

		dao.doLogin(vo);
		System.out.println(vo);
	}

	public static void main(String[] args) {
		new MemberTest();
	}

}
