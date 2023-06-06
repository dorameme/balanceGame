package first_solo_project.demo.member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

//    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    private final List<Member> store = new ArrayList<>();
    public boolean saveMember(Member member){

        if(store.contains(member.getName())){
            return false;
        }
        store.add(member);
        return true;
    }
    public int sizeOfStore(){
        return store.size();
    }

}