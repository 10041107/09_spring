package com.ojiraphers.section01.subsection02.prototype;

import com.ojiraphers.common.Bread;
import com.ojiraphers.common.Product;
import com.ojiraphers.common.Beverage;
import com.ojiraphers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Application {
    /*
     * bean scope란 스프링 빈이 생서될때 생성되는 인스턴스 범위를 의미한다. 스프링에서는 다양한 bean scope를 제공한다.
     * 1. singleton 하나의 인스턴스만 생성하고, 모든 빈이 해당 인스턴스를 공유하며 사용한다.
     * 2. prototype 매번 새로운 인스턴스를 생성한다.
     * 3. request http요청 처리마다 새로운 인스턴스를 생성하고, 요청 처리가 끝나면 인스턴스를 폐기한다. 웹 어플리케이션 컨덱스트에서만 해당된다.
     * 4. session http세션 당 하나의 인스턴스를 생성하고, 세션이 종료되면 인스턴스를 폐기한다. 웹 어플리케이션 컨텍스트에만 해당된다.
     * 5. globelSession 전역 세션 당 하나의 인스턴스를 생성하고, 전역 세션이 종료되면 인스턴스를 폐기한다. 포털 어플리케이션 컨텍스트에서만 해당된다.
     * */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[]beanName = context.getBeanDefinitionNames();
        for (String bean:beanName
        ) {
            System.out.println("BeanName : " + bean);

        }
        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart = context.getBean("cart", ShoppingCart.class);
        cart.addItem(carpBread);
        cart.addItem(milk);
        System.out.println("cart 안에 담긴 것 : " + cart.getItems());

        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart.addItem(water);

        System.out.println("cart 안에 담긴 것 : " + cart.getItems());

        System.out.println("cart의 hashCode : " + cart.hashCode());
        System.out.println("cart2의 hashCode : " + cart2.hashCode());
    }


}
