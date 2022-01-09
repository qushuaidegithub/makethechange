package com.test.testa;

public class Test2 {
	public static final int m = 1;
	private static final int n = 1;
	
	
	public static void main(String[] args) {
		//System.out.println(n);
		int p =5;
		if(--p <5||--p<3){
			System.out.println("p="+p);
		}
		if(--p <5|--p<3){
			System.out.println("p="+p);
		}
	}
}
