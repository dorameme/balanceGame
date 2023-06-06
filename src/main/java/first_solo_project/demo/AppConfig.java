package first_solo_project.demo;

import first_solo_project.demo.member.MemberRepository;
import first_solo_project.demo.member.MemberService;
import first_solo_project.demo.member.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean
    public MemberServiceImpl memberService() {
        return new MemberServiceImpl();
    }//생성자 주입

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

}