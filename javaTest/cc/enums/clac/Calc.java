package com.test.enums.clac;

public enum Calc {
	PLUS{
		int exec(int a,int b){
			return result = a+b;
		}
	},
	MINUS{
		int exec(int a,int b){
			return result = a-b;
		}
	},
	TIMES{
		int exec(int a,int b){
			return result = a*b;
		}
	},
	DIVIDE{
		int exec(int a,int b){
			return result = a/b;
		}
	};
	
	int result;
	
	abstract int exec(int a,int b);
}
