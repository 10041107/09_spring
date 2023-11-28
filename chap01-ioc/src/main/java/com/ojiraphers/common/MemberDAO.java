package com.ojiraphers.common;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;


public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;
    public MemberDAO(){
        this.memberMap = new HashMap<>();

        memberMap.put(1,new MemberDTO(1,"user01","pass01","홍길동"));
        memberMap.put(1,new MemberDTO(2,"user02","pass02","홍길순"));


    }
    public MemberDTO selectMember(int seq){
        return memberMap.get(seq);

    }

    public boolean insertMember(MemberDTO member){
        int before = memberMap.size();
        memberMap.put(member.getSequence(),member);

        return memberMap.size() > before ? true:false;
    }

}


노드js (lms시스템 구현)

    청크파일 스트리밍 시 기술적으로 힘들수도있음
난이도 높음
판매,<법률
        결제시스템<api
        리스크, 업무 흐름 분석 집중적으로
클래스 강좌 같은 경우: 어떤 정책을 갖고있는지 분석해야함
<<쉽지않음(2번강조됨...)
반려돔물 키우는 사람을 모으는 sns가 쉬울수도 있음
혹은 메인으로 강아지 훈련법 올리는 사람 채널을 모아서 뿌리는 형태도 괜찮음
인스타 등으로 소셜 미디어를 만드는 형식이 나을수도 있다.

유튜브 영상 플레이어<< 영상을 갖고오는 형식

::
사진은 괜찮음
스트리밍 처리가 문제
서버에 저장시키는건 맞지만 어떤식으로 스트리밍할수있을지가 관건
노드제이에스 서버를 두고 이미지 스트리밍 하는 방식이 가장 쉬움
프로필 커스텀: 순수 자바스크립트로는 어려움. 라이브러리 찾아야함

아이디어 추천: 펫보험
> 카닥 : 엔진교환주기 등을 알려주는 앱. 견종에 대해 입력하면 뭐 건강상태 알려주는 것... 도 괜찮음

상품: 괜찮음. 영양제도 괜찮음.
메인컨텐츠는 보험으로 가되 관련 서비스를 제공하는 것도 좋음

<<우리 어플리케이션을 쓸수밖에 없는 이유를 만들어라.

질병, 관련 영양제 추천, 상품을 쿠팡파트너스와 연결
필요한 소품 등
강아지에 대한 구분처리가 필요
>보험리스트 추천도 괜찮다
>커뮤니티 구축도 가능

오라클 클라우드, :학원 데이터베이스<<


