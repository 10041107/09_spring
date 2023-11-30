package com.ojiraphers.section03.properties.subsection02.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration

public class ContextConfigration {


    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        //접속하는 세션의 로케일에 따라 자동 재로딩하는 용도의 messageSource rnguscp
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();

        //다국어 메세지를 읽어올 properties파일의 이름을 설정한다.
        messageSource.setBasename("section03/properties/subsection02/i18n/message");
        //불러온 메세지를 해당 시간동안 캐싱한다.
        messageSource.setCacheSeconds(10);
        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }
}
