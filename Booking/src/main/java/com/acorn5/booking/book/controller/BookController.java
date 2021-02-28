package com.acorn5.booking.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> aaabdbfa4d7c429e094458570e48308b633467ae
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.acorn5.booking.book.service.BookService;
<<<<<<< HEAD
 
@Controller
public class BookController {
    @Autowired
    private BookService service; 
    
    //by 준익, 카테고리별 페이징 검색을 위한 컨트롤러_2021.02.28
    @RequestMapping("/bookList/CategoryList.do") //by 준익, bookList 폴더에 있는 CategoryList 파일에 적용_2021.02.28 
    public ModelAndView categoryList(@RequestParam("d_catg")String d_catg, int start, //by 준익, 카테고리별로 적용 받기 위해서 d_catg, 페이징 값을 얻기 위한 start 값 받기_2021.02.28
    								HttpServletRequest request, ModelAndView mav){
    	mav.addObject("categoryList", service.pagingCategory("1", 10, start, d_catg, request, mav)); //by 준익, categoryList 에 pagingCategory 서비스를 거친 값들을 넣어준다 (목차 : 1, 화면에 출력할 개수 : 10)_2021.02.28 
    	mav.setViewName("bookList/CategoryList");
        return mav;
    }
}
=======

@Controller
public class BookController {

	@Autowired
	private BookService service;
	
	@RequestMapping(value = "/bookList/CategoryList.do", method = RequestMethod.GET)
    public ModelAndView categoryList(@RequestParam("d_catg")String d_catg, 
    		HttpServletRequest request, int start, ModelAndView mav){
    		mav.addObject("categoryList", service.pagingCategory("9", 10, start, d_catg, request, mav));
    	mav.setViewName("bookList/CategoryList");
        return mav;
    }
	
    //by준영, bookList.jsp 에 cont, sort 를 인자로 리스트 검색하는 서비스_210222
    @RequestMapping("/bookList/bestSeller.do")
    public ModelAndView bestSeller(@RequestParam(required=false)String d_cont,String sort){
        ModelAndView mav = new ModelAndView();
        
        if(d_cont !=null)
        {
            mav.addObject("bestSeller",service.bestSeller(d_cont,12, 1,sort));
        }
        mav.setViewName("bookList/bestSeller");
        return mav;
    }
    
    //by준영, bookDetail.jsp 에 isbn 을 인자로 리스트(리스트지만 한권) 검색하는 서비스_210222
    @RequestMapping("/detail/bookDetail.do")
    public ModelAndView bookDetail(@RequestParam(required=false)String d_isbn){
    	ModelAndView mav = new ModelAndView();
        
        if(d_isbn !=null)
        {
            mav.addObject("bookDetail",service.bookDetail(d_isbn,1));
        }
        mav.setViewName("detail/bookDetail");
        return mav;
    
    }
    //by준영, bookAjax.jsp 에 저자를 인자로 리스트 검색하는 서비스_210222
    
    @RequestMapping("/detail/detailAjax.do")
    public ModelAndView bookAjax(@RequestParam(required=false)String d_auth,String sort){
    	ModelAndView mav = new ModelAndView();
        
        if(d_auth !=null)
        {
            mav.addObject("detailAjax",service.detailAjax(d_auth,30,sort));
        }
        mav.setViewName("detail/detailAjax");
        return mav;
        }
	
    
    //여기서부터 남기(모의테스트) 
    @RequestMapping("/review/bookList.do")
    public ModelAndView bookList(@RequestParam(required=false)String keyword){
        ModelAndView mav = new ModelAndView();
        
        if(keyword !=null)
        {
            mav.addObject("bookList", service.searchBook(keyword, 10, 1));
        }
        mav.setViewName("review/bookList");
        return mav;
    }
    
    //키워드가 있을때도 있고 없을때도있음 
    //있을때는 가져가고 없을때는 안가져가고 
    @RequestMapping("/review/private/insertform.do")
    public ModelAndView reviewBook(@RequestParam(required=false)String d_isbn){
        ModelAndView mav = new ModelAndView();
        
        if(d_isbn !=null)
        {
            mav.addObject("reviewBook", service.bookReview(d_isbn, 1));
        }
        mav.setViewName("review/private/insertform");
        return mav;
    }
}


>>>>>>> aaabdbfa4d7c429e094458570e48308b633467ae
