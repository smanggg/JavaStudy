package com.kh.inherit.after;

public class TV extends Product { // Product 클래스 상속
	private int inch;
	
	public TV(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price, inch);
		this.inch = inch;
	}
	
	@Override
	public String information()	{
		return super.infotmation() + ", inch: "  + inch;
	}
	
	public void 
}
