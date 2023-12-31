package com.ojiraphers.section.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
public class ContextConfiguration {
    /*
    aspectj의 autoProxy사용에 관한 설정을 해주어야 advice가 동작한다.
    proxyTargetClass=true설정은 cglib를 이용한 프록시를 생성하는 방식으로
    spring 3.2부터 스프링 프레임워크에 포함되어 별도 라이브러리 설정을 하지 않고 사용할 수 있다.
    성능면에서 더 우월하다.
     */

    @EnableAspectJAutoProxy()

}
