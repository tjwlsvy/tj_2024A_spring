package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired AuthService authService; // 스프링 컨테이너의 빈(객체) 주입

    // 1. 인증번호 요청
    @GetMapping("/code")
    public boolean authCode( String email ){
        return authService.authCode(email);
    }

    // 2. 인증번호 인증 / 비교
    @PostMapping("/check")
    public boolean authCheck(String authCodeInput){
        return authService.authCheck(authCodeInput);
    }





}
