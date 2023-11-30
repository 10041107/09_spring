package com.ojiraphers.section03.properties.subsection01.properties;

import com.ojiraphers.common.Beverage;
import com.ojiraphers.common.Bread;
import com.ojiraphers.common.Product;
import com.ojiraphers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean: beanNames
             ) {
            System.out.println(bean);
        }

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart car1 = context.getBean("cart", ShoppingCart.class);

        car1.addItem(carpBread);
        car1.addItem(milk);

        System.out.println("cart1에 담긴 내용 : " + car1.getItems());

        ShoppingCart car2 = context.getBean("cart", ShoppingCart.class);
        car2.addItem(water);
        System.out.println("cart2에 담긴 내용 : " + car2.getItems());

        System.out.println("cart1의 hashcode " + car1.hashCode());
        System.out.println("cart2의 hashcode " + car2.hashCode());


    }

}