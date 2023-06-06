package first_solo_project.demo.member;

public class MemberServiceImpl implements MemberService{


    private final MemberRepository memberRepository;//싱글톤 패턴
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }
    @Override
    public boolean join(Member member) {
        return memberRepository.saveMember(member);
    }
}
