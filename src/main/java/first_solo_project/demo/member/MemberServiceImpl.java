package first_solo_project.demo.member;

import first_solo_project.demo.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService{

    private final List<String> store = new ArrayList<>();
    public boolean saveMember(Member member){

        if(store.contains(member.getName())){/// 지금이해했다....list<member> 로 되어있으면 멤버 객체가 다르므로 계속 답이 아나온다
            return false;
        }
        System.out.println(member.getName());
        store.add(member.getName());
        return true;
    }
    public int sizeOfStore(){
        return store.size();
    }
//    MemberServiceImpl ms=new MemberServiceImpl();
//    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//
//    MemberServiceImpl ms=ac.getBean("memberService",MemberServiceImpl.class);
//    MemberRepository mr = ac.getBean("memberRepository",MemberRepository.class);
//    //    private final MemberRepository memberRepository;/싱글톤 패턴

    @Override
    public boolean join(Member member) {
        return saveMember(member);
    }
}
