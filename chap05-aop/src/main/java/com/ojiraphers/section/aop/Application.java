package com.ojiraphers.section.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.ojiraphers.section.aop");
        MemberService memberService = context.getBean("memberService", MemberService.class);
        System.out.println("==================selectMembers================");
        System.out.println();

        System.out.println("==================selectMember================");
        System.out.println();
    }

}
