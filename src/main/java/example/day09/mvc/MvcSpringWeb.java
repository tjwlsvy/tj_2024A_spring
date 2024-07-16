package example.day09.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  // 1. 내장 톰캣(웹서버) 실행 2. Mvc 어노테이션들을 스캔해서 빈(객체) 등록
public class MvcSpringWeb {
    public static void main(String[] args) {
        SpringApplication.run(MvcSpringWeb.class);
    }
}

// view : resources 폴더 안에 있는 html , css , js 파일 검색

// @Controller
@RestController
class MvcSpringWebController{
   @Autowired MvcSpringWebService service;
}

@Service
class MvcSpringWebService{
    @Autowired MvcSpringWebDao dao;
}

@Component
class MvcSpringWebDao{

}

