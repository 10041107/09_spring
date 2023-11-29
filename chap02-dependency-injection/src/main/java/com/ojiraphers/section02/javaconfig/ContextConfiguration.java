package com.ojiraphers.section02.javaconfig;
import com.ojiraphers.common.Account;
import com.ojiraphers.common.MemberDTO;
import com.ojiraphers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20, "110-233-2222");}

        @Bean
                public MemberDTO memberGenerator(){
        MemberDTO member = MemberDTO.builder()
                .seq(20)
                .email("nong@ge.com")
                .name("홍석천")
                .personalAccount(accountGenerator())
                .phone("010-2323-3333").build();
        return member;

    }
}
