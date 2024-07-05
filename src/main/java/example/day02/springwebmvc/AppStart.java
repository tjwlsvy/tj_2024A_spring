package example.day02.springwebmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 어노테이션 주입
@SpringBootApplication

public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);




    }
}



/*
    서로다른 클래스들 간의 메소드를 호출하는 방법
    1. 인스턴스 생성통해 메소드 호출
        클래스명 변수명 = new 생성자명(0
        변수명.메소드명();

    2. 인스턴스 생성 후 메소드 호출
        new 생성자명().메소드명();

    3. [싱글톤] 미리 인스턴스 만들고 미리 만든 인스턴스 호출 후 메소드 호출
        클래스명.getInstance().메소드명();

    4. 메소드가 static으로 선언 되었을때.
        클래스명.메소드명();


*/
