package com.ojiraphers.section02.initdestrory.subsection02.annotation;

import com.ojiraphers.common.Beverage;
import com.ojiraphers.common.Bread;
import com.ojiraphers.common.Product;
import com.ojiraphers.common.ShoppingCart;
import org.springframework.context.annotation.*;

import java.util.Date;


@Configuration
@ComponentScan("com.ojiraphers.section02.initdestrory.subsection02.annotation") // 어디서부터 정보를 긁어올거냐
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



}
