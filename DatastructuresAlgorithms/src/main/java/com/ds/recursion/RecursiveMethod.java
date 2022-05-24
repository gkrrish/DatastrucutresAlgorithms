package com.ds.recursion;

public class RecursiveMethod {
	public static void main(String[] args) {
		RecursiveMethod rm=new RecursiveMethod();
		rm.method(1, "first");
	}
	
	
	public void method(int number, String name) {
		
		if(number<=3) {
			System.out.println(number+" "+name);
			number++;
			method(number,"first");
			method(number,"second");
			another(number,name);
		}
		
	}
	public void another(int number,String name) {
		System.out.println("another : "+number+" "+name);
	}

}
