package com.test.enums;

public class EnumTest {
	public static void main(String[] args) {
		for (Season s : Season.values()) {
			s.sayName();
		}
		
		for (FiveElements e : FiveElements.values()) {
			e.sayInChinese();
		}
		
		System.out.println(FiveElements.EARTH);
		FiveElements.EARTH.sayInChinese();
	}
}
