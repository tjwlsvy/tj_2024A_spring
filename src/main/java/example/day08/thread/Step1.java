package example.day08.thread;

import java.awt.*;

public class Step1 {
    public static void main(String[] args) {

        //=================싱글 스레드===================================//
        // 1.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
            // Toolkit : java.awt 자바의 UI(화면 , 소리 등등) 라이브러리
        for (int i = 0; i <= 5; i++) {  // 5회반복
            toolkit.beep(); // '띵' 비프음 소리 출력
            // 비프음 소리출력 속도보다 for문의 5회반복 속도가 더 빠르다
            // for문을 처리하는 흐름[스레드]을 잠시 일시정지
                // Thread.sleep( 밀리초 ) : 밀리초 만큼 스레드가 일시 정지
                // 밀리초 : 1 / 1000 초
            try { Thread.sleep(1000);
            }catch (Exception e){ System.out.println(e); }
        }

        // 2. '띵;' 5회 console ㅜㄹ력
        for (int i = 0; i <= 5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            }catch (Exception e){  System.out.println(e);    }
        }
        //============================================================//
        //========================멀티 스레드1=========================//
        작업스레드A threadA = new 작업스레드A();
        // 2. 작업스레드A 의 스레드 실행 (run 메소드 실행 )
        threadA.start();

        // 2. '띵;' 5회 console 출력
        for (int i = 0; i <= 5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            }catch (Exception e){  System.out.println(e);    }
        }
        //========================멀티 스레드2=========================//
        // 1. 작업스레드B의 구현(객)체 생성
        Runnable runnable1 = new 작업스레드B();
        // 2. Thread 객체
        Thread threadB = new Thread(runnable1);
        // 3. ThreadB 실행
        threadB.start();
        // 2. '띵;' 5회 console 출력
        for (int i = 0; i <= 5; i++){
            System.out.println("띵");
            try {  Thread.sleep(1000);
            }catch (Exception e){  System.out.println(e);    }
        }

        //========================멀티 스레드3-1=========================//
        // 익명 객체/구현체 : 이름 없는 객체
            // new 생성자(){익명구현체 정의}
        // 1. (익명) 구현객체
        Thread threadC = new Thread() {
            @Override
            public void run() {
                // 1.
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                // Toolkit : java.awt 자바의 UI(화면 , 소리 등등) 라이브러리
                for (int i = 0; i <= 5; i++) {  // 5회반복
                    toolkit.beep(); // '띵' 비프음 소리 출력
                    // 비프음 소리출력 속도보다 for문의 5회반복 속도가 더 빠르다
                    // for문을 처리하는 흐름[스레드]을 잠시 일시정지
                    // Thread.sleep( 밀리초 ) : 밀리초 만큼 스레드가 일시 정지
                    // 밀리초 : 1 / 1000 초
                    try {Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        // thread 실행
        threadC.start();
        //========================멀티 스레드3-2=========================//
        Thread threadD = new Thread(new Runnable() {
            @Override
            public void run() {
                // 1. 구현체
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                // Toolkit : java.awt 자바의 UI(화면 , 소리 등등) 라이브러리
                for (int i = 0; i <= 5; i++) {  // 5회반복
                    toolkit.beep(); // '띵' 비프음 소리 출력
                    // 비프음 소리출력 속도보다 for문의 5회반복 속도가 더 빠르다
                    // for문을 처리하는 흐름[스레드]을 잠시 일시정지
                    // Thread.sleep( 밀리초 ) : 밀리초 만큼 스레드가 일시 정지
                    // 밀리초 : 1 / 1000 초
                    try {Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });
        // 2. 스레드 실행
        threadD.start();




    } // m end
} // c end
