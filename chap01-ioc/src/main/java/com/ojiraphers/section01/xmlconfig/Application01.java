package com.ojiraphers.section01.xmlconfig;

import com.ojiraphers.common.MemberDAO;
import com.ojiraphers.common.MemberDTO;
import com.ojiraphers.section01.test.SnsLogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application01 {

    public static void main(String[] args) {

//        Spring 프레임워크에서는 Spring IoC 컨테이너에 의해 관리되는 객체를 'Spring Bean'이라고 합니다.
//        Spring IoC 컨테이너는 애플리케이션의 구성 요소들을 생성하고 관리하는데, 이러한 구성 요소들이 Spring Bean입니다.

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        //bean의 이름으로 꺼내오는 법
//        MemberDTO member = (MemberDTO) context.getBean("member");

        //bead의 타입으로 꺼내오는 법
//        MemberDTO member = context.getBean(MemberDTO.class);

        //bean의 id와 클래스 메타 정보를 전달하여 가져오는 방법
        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println(member);

        System.out.println("=============");

        SnsLogin login = context.getBean("kakao", SnsLogin.class);
        login.login();

    }


}
