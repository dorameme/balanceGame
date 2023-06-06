package first_solo_project.demo.member;

import java.util.HashMap;

public class MemberRepository {
    HashMap <String, Long> store=new HashMap<>();

    public void saveMember(Member member){
        store.put(member.getName(), member.getRanking());
    }
}
