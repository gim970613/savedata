package com.javalec.function;

public class Calc {
	//필드
	int num1,num2;
	//생성자
	public Calc() {
		
	}
	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
		compute();
	}	
	//메소드
	private void compute() {
		// 덧
		System.out.println("덧셈 : "+(num1+num2));
		// 뺄
		System.out.println("뺄셈 : "+(num1-num2));
		// 곱
		System.out.println("곱셈 : "+(num1*num2));
		// 나눗
		double num3 = num1;
		double nanuk = num3/num2;
		System.out.println("나눗셈 : "+(nanuk));
	}
}
