package com.kh.d_object.practice2.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book () {
		
	}
	public Book (String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	public Book (String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public void inform()	{
//		System.out.printf("도서명: " + "%s : " + "저자명: " + "%s" + "출판사: " + "%s" + "가격 : " + "%d" + "할인율 : " + "%f\n");
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격 : %d 할인율 : %f\n"
				,title, publisher, author, price, discountRate);
	}
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor () {
		return author;
	}
	public int getPrice ()	{
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double dicountRate) {
		this.discountRate = dicountRate;
	}
} 
