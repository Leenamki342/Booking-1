package com.acorn5.booking.review.dto;

<<<<<<< HEAD
import org.springframework.web.multipart.MultipartFile;

public class ReviewDto {
	private int num; // 리뷰 번호
	private String writer; // 리뷰 작성자
	private String imagePath; // 리뷰 이미지 경로
	private String reviewTitle; // 리뷰 제목
	private String content; // 리뷰 내용
	private int viewCount; // 리뷰의 조회수
	private String regdate; // 작성일
	private int startRowNum; // 시작 번호
	private int endRowNum; // 마지막 번호
	private String isbn; // 책 고유번호
	private MultipartFile image; // 이미지 파일
	//디폴트 생성자 
	public ReviewDto() {}
	
	public ReviewDto(int num, String writer, String imagePath, String reviewTitle, String content, int viewCount,
			String regdate, int startRowNum, int endRowNum, String isbn, MultipartFile image) {
		super();
		this.num = num;
		this.writer = writer;
		this.imagePath = imagePath;
		this.reviewTitle = reviewTitle;
		this.content = content;
		this.viewCount = viewCount;
		this.regdate = regdate;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.isbn = isbn;
		this.image = image;
	}
=======
public class ReviewDto {
	private int num;
	private String writer;
	private String title;
	private String content;
	private String date;
	private String author;
	private String publisher;
	private String bookImage;
	
	public ReviewDto() {}
>>>>>>> ef3bf00df3e4e57c0226f53610c7b1d70e107c7c

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

<<<<<<< HEAD
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
=======
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
>>>>>>> ef3bf00df3e4e57c0226f53610c7b1d70e107c7c
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

<<<<<<< HEAD
	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
	
	
}
=======
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public ReviewDto(int num, String writer, String title, String content, String date, String author, String publisher,
			String bookImage) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.date = date;
		this.author = author;
		this.publisher = publisher;
		this.bookImage = bookImage;
	}
}
>>>>>>> ef3bf00df3e4e57c0226f53610c7b1d70e107c7c
