package com.kh.d_object.practice1.run;

import com.kh.d_object.practice1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// Product type 의 객체 생성
		Product p1 = new Product();
		// p1.productName
		p1.setName("아이폰16");
		p1.setPrice(1000000);
		p1.setBrand("애플");
		
		p1.infomation();
		
		Product p2 = new Product();
		p2.setName("갤럭시 S25");
		p2.setPrice(1350000);
		p2.setBrand("삼성");
		
		p2.infomation();
	}

}
