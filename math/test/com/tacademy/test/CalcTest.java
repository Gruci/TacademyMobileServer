package com.tacademy.test;

import com.tacademy.math.util.Calc;
import com.tacademy.math.vo.Data;

public class CalcTest {

	public CalcTest() {
		Data d = new Data();
		d.setNum1(4);
		d.setNum2(8);
		d.setOpt("*");
		
		Calc calc = new Calc();
		calc.doCalc(d);
		System.out.println(d);
	}

	public static void main(String[] args) {
		new CalcTest();
	}

}
