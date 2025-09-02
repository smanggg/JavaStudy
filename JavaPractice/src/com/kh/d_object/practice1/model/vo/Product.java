package com.kh.d_object.practice1.model.vo;

import java.net.FileNameMap;

public class Product {
	// ----------
	private String productName;
	private int price;
	private String brand;
	
	//------생성자부--------
	/*
	 * 	+ Product()
	 * 
	 * 	+ => Product 접근제한자
	 *  Product() => 기본생성자
	 *  
	 *  접근제한자 생성자
	 */
	public Product() {}
	
	//----------메소드부 ----------
	/*
	 *  + setter()/getter()
	 *  +information() : void
	 *  
	 *  setter()/getter() -> private 필드에 대한 set메소드, get메소드
	 *  
	 *  접근제한자 메소드명([매개변수]) : 반환형
	 */
	
	
	public void infomation() {
		// 출력 결과 참고해서 기능 작성
		// "이름 / 가격 / 브랜드" 출력!
		System.out.printf("%s / %d / %s\n", productName, price, brand);
	}
	
	// productName:String
	public String getProductName() {
		return productName;
	}
	public void setName(String productName) {
		this.productName = productName;
	}
	
	// price:int
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// brand:String
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	

}
