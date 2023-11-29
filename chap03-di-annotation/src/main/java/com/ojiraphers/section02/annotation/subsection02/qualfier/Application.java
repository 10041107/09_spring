package com.ojiraphers.section02.annotation.subsection02.qualfier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ojiraphers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean:beanNames
             ) {
            System.out.println(bean);
        }
        PokemonService pokemonService = context.getBean("pokemonServiceQualifier", PokemonService.class);

        pokemonService.pokemonAttack();


    }
}
