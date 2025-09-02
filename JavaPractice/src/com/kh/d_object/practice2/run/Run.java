package com.kh.d_object.practice2.run;

import com.kh.d_object.practice2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book p1 = new Book();
		p1.setTitle("객체지향의 사실과 오해");
		p1.setAuthor("조영호");
		p1.setPublisher("위키북스");
		p1.setPrice(25000);
		p1.setDiscountRate(0.1);
		
		p1.inform();
		
		Book p2 = new Book("클린 코드", "로버트 C.","인사이트");
		p2.setPrice(38000);
		p2.setDiscountRate(0.15);
		
		p2.inform();
		
		Book p3 = new Book("실용주의 프로그래머", "앤드류 헌트, 데이비드 토마스","인사이트",35000,0.15);
		p3.inform();
	}

}
