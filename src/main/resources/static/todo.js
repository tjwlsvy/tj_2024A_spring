
console.log('todo.js')

// let todoList = ["밥먹기,X"];
 // 1달에는 js에서 관리 했지만 3달에는 웹서버(spring -> db서버) 관리하기 때문에 필요없다

 // 할일 등록
function todocreate(){  console.log('todocreate() load')
    // [1] html 입력받은 값 가져오기
        // [1-1] dom 가져오기
    let todoInput = document.querySelector(`#todoInput`);
    console.log(todoInput);

        // [1-2] 가져온dom의 입력값 호출
    let tcontent = todoInput.value;
    console.log(tcontent);

    // [2] AJAX(JQ) 이용한 웹서버(컨트롤러) 통신해서 요청과 응답하기
    let ajaxoption = {
        method : 'post',                            // HTTP 매소드 선택(get , post , put , delete)
        url : '/todo/create?tcontent='+tcontent,    // HTTP 통신할 경로 작성(http://localhost:8080 IP와 PORT 생략)
        success : function response(result){        // HTTP 통신 성공시 응답값을 함수의 매개변수로 받는다.
            console.log(result);        // 응답 결과 확인
            if(result == true){
                alert('할일등록성공');      // 성공안내
                todoInput.value = '';       // 입력상자에 입력된 값 없애기
                todoreadall();              // 등록 성공시 할일 목록 전체 출력 함수 호출
            }
            else{alert('할일등록실패');}    // 실패안내
        }// s end
    }// 옵션 end
    // AJAX 는 JQUERY 라이브러리 포함된 함수이다 . $는 JQUERY 문법이다.
    $.ajax(ajaxoption)  // AJAX(웹서버와 통신하기) 실행

    
}// todo end

// 할일 목록 전체 출력 , 실행조건 : 1. js 열렸을때 , 2. 등록/삭제/수정 (상태변경시)성공시
todoreadall();
function todoreadall(){

    // - 출력할 데이터 가져오기 
    $.ajax({
        method : 'get',
        url : '/todo/readall',
        success : function response(result){
            console.log(result);    // 결과받은 타입은 리스트

            // [1] 어디에
            let todoBox = document.querySelector(`#todoBox`);
            // [2] 무엇을
            let html = ``;

            // [1] for 문 for(let i = 0; i < result.length; i++){}
            // [2] 리스트명.forEach (반복변수명=>{실행문})
            result.forEach(todoDto => {
                html +=`<div id=${todoDto.tstate == 0 ? 'whiteBOX' : 'blackBox'}>
                <span> ${todoDto.tcontent} </span>
                <div>
                    <button type="button" onclick="change(${todoDto.tno})">변경</button>
                    <button type="button" onclick="remove(${todoDto.tno})">삭제</button>
                </div>
            </div>`            
            });
        }

    }); // ajax end

    // [1] 어디에
    let todoBox = document.querySelector(`#todoBox`);
    // [2] 무엇을
    let html = ``;
    // [3] 출력
    todoBox.innerHTML = html;
}//todoreadall end


// 3. 수정함수
function todoupdate( tno ){  
    // $.ajax( {옵션속성객체} ); 
    $.ajax( {
        method : 'put' ,    
        // url 안에 쿼리스트링형식으로 데이터 대입
        url : `/todo/update?tno=${tno}` ,
        success : function response( result ){ 
            console.log( result );
            if( result ){ todoreadall();} // 새로고침
            else{ alert('오류발생:관리자에게문의'); }
        } // success end 
    }); // ajax end 
} //  todoupdate end 


// 삭제
function tododelete(tno){
    
    $.ajax({
        method : 'delete',
        url : '/todo/delete',
        // url 아닌 data 속성에 {key : value} 형식의 데이터 대입.
        data : {'tno' : tno},
        // [화살표함수] success : result =>{}
        // [익명함수] success : function(result){}
        // [일반함수] success : function response(result){}
        success : result =>{
            console.log(result);
            if(result){todoreadall()}   // 새로고침
            else{alert('요류발생 : 관리자에게 문의');}
        }
    });
}