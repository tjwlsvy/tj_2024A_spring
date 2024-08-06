package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.model.dto.BoardDto;
import web.model.dto.BoardPageDto;
import web.service.BoardService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired private BoardService boardService;
    // 1. 전체 카테고리 호출
    @GetMapping("/category")
    // public List<BoardDto> bcFindAll(){
    public List< Map<String,String> > bcFindAll( ) {
        System.out.println("BoardController.bcFindAll");
        return boardService.bcFindAll();
    }
    // 2. 글 쓰기 처리
    @PostMapping("/write")
    // { "bcno" : 1 ,  "btitle" : "안녕" ,  "bcontent" : "하하하" }
    public boolean bWrite( BoardDto boardDto) {
        System.out.println("BoardController.bWrite");
        System.out.println("boardDto = " + boardDto);
        return boardService.bWrite( boardDto );
    }
    // 3. 게시물 전체 조회 처리
    @GetMapping("/find/all")
    public  BoardPageDto bFindAll( BoardPageDto pageDto ){
            // --- 매개변수
            // 1. page : 페이징 처리 에서 사용할 현재 페이지번호
            // 2. bcno : 현재 선택된 카테고리 번호
            // 3. searchKey : 검색 조회시 사용되는 필드명
            // 4. searchKeyword : 검색 조회시 사용되는 필드의 값
        return boardService.bFindAll( pageDto );
    }

    // 4. 게시물 개별 조회 처리
    @GetMapping("/find/bno")
    public BoardDto bFindBno( int bno ){
        return boardService.bFindBno(bno);
    }

    // 5. 게시물의 댓글 쓰기 (기능/로직)처리
    @PostMapping("/reply/write")
    // ?? 왜 post 사용하는지?  // http://localhost:8080/board/reply/write
    public boolean bReplyWrite(@RequestBody Map<String , String> map){
        // ?? 왜 @RequestBody 사용하는지 ?? HTTP 요청의 본문(body)을 자바 객체로 변환
        // ?? 왜 map 사용하는지? 다양한 상황에서 유용하게 쓰임(데이터 중복 방지 , 유연한 데이터 처리 )
        System.out.println("BoardController.bReplyWrite");
        System.out.println("map = " + map);
        return boardService.bReplyWrite(map);   //  ?? 왜 Service 사용하는지? 재사용성과 유지보수를 용이하게 하기 위해서 애플리케이션을 보다 효율적으로 관리
    }

    // 6. 게시물 댓글 출력
    @GetMapping("/reply/print")
    public List< Map<String,String> > bReplyPrint(int bno){
        System.out.println("BoardController.bReplyPrint");
        System.out.println("boardService = " + boardService);
        return boardService.bReplyPrint(bno);
    }


}


    // GetMapping : 출력
    // PostMapping : 쓰기
    // PutMapping : 수정
    // DeleteMapping : 삭제














