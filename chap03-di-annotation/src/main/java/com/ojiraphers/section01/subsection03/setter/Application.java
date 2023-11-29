package com.ojiraphers.section01.subsection03.setter;

import com.ojiraphers.section01.subsection02.constructor.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

//      AnnotationConfigApplicationContext 생성자에 bacePackages문자열을 전달하며 ApplicationContext를 생성한다.
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ojiraphers.section01");


        BookService bookService = context.getBean("BookServiceSetter", BookService.class);

//      전체 도서 목록 조회 후 출력 확인
        bookService.selectAllBooks().forEach(System.out::println);

//       도서번호로 검색 후 출력 확인
        System.out.println(bookService.selectOneBook(1));
        System.out.println(bookService.selectOneBook(2));

    }


}