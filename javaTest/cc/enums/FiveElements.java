package com.test.enums;

public enum FiveElements {
	METAL,WOOD,WATER,FIRE,EARTH;
	private String chineseName;
	public void sayInChinese(){
		
		switch (this) {
		case METAL:
			this.chineseName="金";
			break;
		case WOOD:
			this.chineseName="木";
			break;
		case WATER:
			this.chineseName="水";
			break;
		case FIRE:
			this.chineseName="火";
			break;
		case EARTH:
			this.chineseName="土";
			break;

		default:
			this.chineseName="五行之一";
			break;
		}
		
		System.out.println(this.chineseName);
	}
}
