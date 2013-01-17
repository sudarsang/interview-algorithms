package com.appinmotion.alg.java;

public class InheritanceTest {
	
	public InheritanceTest(){
		System.out.println("parent created");
	}
	
	public void test(){
		method1();
	}
	
	public void method1(){
		System.out.println("parent method 1");
	}
	

	public class Child extends InheritanceTest {

		
		public Child(){
			System.out.println("child created");
		}
		
		@Override
		public void method1() {
			
			System.out.println("child method 1");
		}
	}
}
