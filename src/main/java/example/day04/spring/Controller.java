package example.day04.spring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;

@org.springframework.stereotype.Controller
public class Controller {
// ===================.jsp========================//
    @RequestMapping("/")
    public @ResponseBody String root() throws Exception{
        return "JSP in Gradle";
    }
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
    @RequestMapping("/test2")
    public String test2(){
        return "test2";
    }
    // ======================타임리프=====================//

    @RequestMapping("/test3")
    public String test3(){
        return "test1.html";
    }



}
