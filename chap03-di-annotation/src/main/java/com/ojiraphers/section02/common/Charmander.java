package com.ojiraphers.section02.common;

import org.springframework.stereotype.Component;
/*
subsection01.primary
@Primary어노테이션을 설정하면 @Autowried로 동일한 타입의 여러 빈을 찾게 되는 경우 자동으로 연결을 우선시할 타입을 설정하게 된다.
동일한 타입의 클래스 중 한개만 @Primary어노테이션을 사용할 수 있다.
 */

//Primary: 얘를 기본으로 설정한다. 만약 없을시 중복 동작되는 요소가 3개 있다... 하고 오류난다.
@Component

public class Charmander implements Pokemon{


    @Override
    public void attack() {
        System.out.println("파이리 불꽃 공격");
    }
}
