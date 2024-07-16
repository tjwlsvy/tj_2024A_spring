package example.day08.thread;

import java.time.LocalTime;

public class DigitalTine extends Thread{
    @Override
    public void run() {
        // === 멀티스레드가 처리할 코드들 === //
        while (true){
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            }catch (Exception e){  System.out.println(e);  }





        } // w ene
    }   // m end
}   // c end
