package com.ojiraphers.section02.initdestrory.subsection01.java;

import com.ojiraphers.common.Beverage;
import com.ojiraphers.common.Bread;
import com.ojiraphers.common.Product;
import com.ojiraphers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.Date;
import java.util.Objects;

public class ContextConfiguration {
    @Bean
    public Product carpBread(){
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유", 1500, 500);
    }
    @Bean
    public Product water(){
        return new Beverage("지리산암반수", 3000, 500);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
//    initMethod = 빈이 등록될때 실행 // destroyMethod = 빈이 삭제될때 실행
    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
    public Owner owner(){
        return  new Owner();
    }

}
