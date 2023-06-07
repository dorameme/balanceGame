package first_solo_project.demo.controller;

import first_solo_project.demo.AppConfig;
import first_solo_project.demo.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BasicController {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    MemberServiceImpl ms=ac.getBean("memberService",MemberServiceImpl.class);
//    MemberRepository mr = ac.getBean("memberRepository",MemberRepository.class);

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "question";
    }
    @PostMapping("question")
    public String question(HttpServletRequest httpServletRequestModel,Model model){

        String id= httpServletRequestModel.getParameter("name");
        Member mem=new Member();
        mem.setName(id);
        model.addAttribute("id",id);
        if(ms.join(mem)==false){

            System.out.println("error로");
            return "error";
        }
        System.out.println(ms.join(mem)+" "+ms.sizeOfStore()+"q2로");
        return "question3";
    }

}