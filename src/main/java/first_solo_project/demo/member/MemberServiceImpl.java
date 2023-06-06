package first_solo_project.demo.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;//싱글톤 패턴
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.saveMember(member);
    }

    @Override
    public Long checkRanking(Member member) {
        return member.getRanking();
    }
}
