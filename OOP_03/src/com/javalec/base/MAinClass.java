package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;

public class MAinClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
		
		Calc calc = new Calc(num1, num2);
		
	}

}
