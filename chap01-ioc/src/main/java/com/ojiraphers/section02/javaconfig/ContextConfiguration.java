package com.ojiraphers.section02.javaconfig;

import com.ojiraphers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration("configurationSection02")
public class ContextConfiguration {

    @Bean(name = "member")
    public MemberDTO getMember(){
        return new MemberDTO(1,"user02","pass","홍길동");
    }

}
