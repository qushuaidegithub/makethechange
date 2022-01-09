package com.test.innerclass;

public class OuterClass {
	
	public String name = "OuterClass";
	
	//静态内部类
	public static class StaticInnerClass{
		public String name = "StaticInnerClass";
		public void sayName(){
			System.out.println(name);
		}
	}
	
	//非静态内部类
	public class InnerClass{
		public String name = "InnerClass";
		public void sayName(){
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.name);
		
		StaticInnerClass sic1 = new OuterClass.StaticInnerClass();
		OuterClass.StaticInnerClass sic2 = new OuterClass.StaticInnerClass();//外部调用

		//InnerClass ic0 = new InnerClass();报错，不能单独创建内部类，必须有与外部类的连接
		InnerClass ic1 = oc.new InnerClass();
		InnerClass ic2 = new OuterClass().new InnerClass();
		OuterClass.InnerClass ic3 = new OuterClass().new InnerClass();//外部调用
	}
}
