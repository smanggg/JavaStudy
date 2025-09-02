package com.kh.object.access.run;

import com.kh.object.access.AccessTest;

public class Run {

	public static void main(String[] args) {
		//AccessTest 객체 생성
		AccessTest test = new AccessTest();
		
		// public 멤버 접근 o
		System.out.println(test.publicField);
		test.publicMethod();
		
		// protected x
		//System.out.println(test.protectedField);
		//test.protectedMethod();
		
		// default x
		//System.out.println(test.defaultField);
		//test.defaultMethod();
		
		// private x
		//System.out.println(test.privateField);
		//test.privateMethod();
		
	}

}
