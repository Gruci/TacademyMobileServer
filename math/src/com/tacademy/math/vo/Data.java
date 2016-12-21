package com.tacademy.math.vo;

public class Data {
	private int num1;
	private int num2;
	private String opt;
	private int result;
	
	public Data(){}
	
	public Data(int num1, int num2, String opt, int result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.opt = opt;
		this.result = result;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Data [num1=" + num1 + ", num2=" + num2 + ", opt=" + opt + ", result=" + result + "]";
	}	
}
