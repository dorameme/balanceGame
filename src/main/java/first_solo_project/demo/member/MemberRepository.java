package first_solo_project.demo.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemberRepository {
    private List<Member> store = new ArrayList<>();
    public boolean saveMember(Member member){

        if(store.contains(member.getName())){
            return false;
        }
        store.add(member);
        return true;
    }

}
