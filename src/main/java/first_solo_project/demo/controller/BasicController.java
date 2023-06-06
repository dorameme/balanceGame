package first_solo_project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BasicController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "question";
    }
    @PostMapping("question")
    public String question(HttpServletRequest httpServletRequestModel,Model model){
        String id= httpServletRequestModel.getParameter("name");
        model.addAttribute("id",id);
        return "question2";
    }
}
//    }
//    @GetMapping("hello-mvc")
//    public String helloMvc(@RequestParam("name") String name, Model model){
//        model.addAttribute("name",name);
//        return "hello-template";
//    }
//    @GetMapping("hello-string")
//    @ResponseBody
//    public String helloString(@RequestParam("name") String name){
//        return "hello"+ name;
//    }
//
//    @GetMapping("hello-api")//
//    @ResponseBody
//    public Hello helloApu(@RequestParam("name")String name)
//    {
//        Hello hello=new Hello();
//        hello.setName(name);
//        return hello;
//
//    }
//    static class Hello{
//        private String name;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//}
