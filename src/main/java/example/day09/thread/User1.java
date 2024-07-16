package example.day09.thread;

public class User1 extends Thread{

    Calculator calculator;  // 계산기 필드타입을 갖고있는 멤버변수
    int value;

    @Override
    public void run() {
        calculator.setMemory(value);
    }   // r end


}   // c end
