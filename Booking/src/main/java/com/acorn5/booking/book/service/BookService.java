<<<<<<< HEAD
package com.acorn5.booking.book.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.acorn5.booking.book.dto.BookDto;

//by 준익, 네이버 도서 api 관련 서비스 관리 인터페이스_2021.02.26
public interface BookService {
	
	//by 준익, 네이버 도서 api 카테고리별 검색 및 페이징 메소드_2021.02.28
	public List<BookDto> pagingCategory(String d_cont, int display, int start, String d_catg, HttpServletRequest request, ModelAndView mav);

}
=======
package com.acorn5.booking.book.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.acorn5.booking.book.dto.BookDto;

@Service
public interface BookService {
	
	//by 준익, 네이버 도서 api 카테고리별 검색 및 페이징 메소드 
	public List<BookDto> pagingCategory(String d_isbn, int display, int start, String d_catg, HttpServletRequest request, ModelAndView mav);
	//by 준영, 네이버 도서 api 판매량순 인기도서 검색 메소드_210228
	public List<BookDto> bestSeller(String d_cont,int display, int start, String sort);
	//by 준영, 네이버 도서 api 해당 isbn 값 도서 검색 메소드_210228
	public List<BookDto> bookDetail(String d_isbn,int display);
	//by 준영, 네이버 도서 api 해당 auth 값 도서 검색 메소드_210228
	public List<BookDto> detailAjax(String d_auth,int display, String sort);
	//(남기거 테스트)
	public List<BookDto> searchBook(String keyword, int display, int start);
	public List<BookDto> bookReview(String d_isbn, int display);
	//(욱현이거 테스트)
	public List<BookDto> recommendBook(String d_cont, int display, int start, String sort, ModelAndView mView);
	//로그인시 
	public List<BookDto> recommendBook(int display,int start,String sort, String query, ModelAndView mView);
	//부킹서비스용
	public Map<String, Object> recommendBook(String d_cont,int display, int start);
}
>>>>>>> aaabdbfa4d7c429e094458570e48308b633467ae
