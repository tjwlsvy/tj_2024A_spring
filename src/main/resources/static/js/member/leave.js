console.log('leave.js')


// [1] 회원탈퇴 함수
function doLeave(){
    let pwConfirm = document.querySelector('.pwConfirm').value;
    
    $.ajax({
        method : "delete" ,             // HTTP METHOD : 통신할때 사용할 method 선택
        url : "/member/leave" ,         // HTTP URL : 통신할 경로 
        data : {pwConfirm : pwConfirm}, // HTTP 보내는 DATA 
        success : (result)=>{           // HTTP 받는 DATA
            if(result){
                alert('탈퇴성공');
                location.href="/member/login";
        }else{alert('로그인정보와 일치하지 않습니다.')}
        }
    })

}