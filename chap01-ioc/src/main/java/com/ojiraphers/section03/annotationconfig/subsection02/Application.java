package com.ojiraphers.section03.annotationconfig.subsection02;

import com.ojiraphers.common.MemberDAO;
import com.ojiraphers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("classpath:section03/annotationconfig/subsection02/xml/spring-context.xml");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println(bean);
        }

        MemberDAO memberDAO = context.getBean(MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3, "user03", "pass03", "홍석삼")));
        System.out.println(memberDAO.selectMember(3));
    }
}
