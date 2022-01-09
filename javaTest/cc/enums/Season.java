package com.test.enums;

//枚举不可以继承，默认继承enum
public enum Season implements Say{
	SPRING("春天"){
		public void sayName(){
			System.out.println("我是春天");
		}
	},SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");

	private Season(String name){
		this.name=name;
	}
	
	private String name;
	
	@Override
	public void sayName() {
		System.out.println(this.name);
	}
	
}
