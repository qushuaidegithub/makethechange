package com.test.innerclass;

import com.test.innerclass.OuterClass.InnerClass;
import com.test.innerclass.OuterClass.StaticInnerClass;

public class OtherClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		StaticInnerClass sic0 = new OuterClass.StaticInnerClass();
		OuterClass.StaticInnerClass sic1 = new OuterClass.StaticInnerClass();
		
		InnerClass ic0 = oc.new InnerClass();
		OuterClass.InnerClass ic1 = new OuterClass().new InnerClass();
		OuterClass.InnerClass ic2 = oc.new InnerClass();
		
	}
}
