console.log('phonebook.js 열림')

let phonebookDB = [ ]
// 1. 등록함수 : 등록버튼을 눌렀을때.
function postPhone(){
    // 1. 입력받고
    let name = document.querySelector('#name').value;
    let phone = document.querySelector('#phone').value;

    // 2. 객체화
    let phoneDto = {name : name , phone : phone}

    // 3. 배열저장
    phonebookDB.push(phoneDto)

    // 4. 안내/새로고침
    alert('save');
    getPhone();


}


// 2. 출력함수 : 등록처리가 되었을때 ,  js가 열렸을때 최초 1번 실행
getPhone();
function getPhone(){
    // 1. 어디에
    let phoneListBox = document.querySelector('#phoneListBox')

    // 2. 무엇을
    let html = '';  // JAVA -> , js =>
    phonebookDB.forEach(phone => {
        html += `<div> <span> ${phone.name} </span> <span>${phone.phone}</span></div>`
        })

      // 3. 출력
      phoneListBox.innerHTML = html
}