package com.kh.inter.ex1;

public class Tiger implements Animal {

	// Shift + Alt + s v
	@Override
	public void move() {
		System.out.println("호랑이가 슬금슬금 걷습니다.");
	}

	@Override
	public void eat() {
		System.out.println("호랑이가 고양이를 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("어흥~ 어흥~");
	}
	
	
}
