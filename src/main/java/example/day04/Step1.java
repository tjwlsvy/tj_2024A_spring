package example.day04;

public class Step1 {
    public static void main(String[] args) {

        // [1] 문자열 선언하는 두가지 방법
        String str1 = new String("abc");    // [힙 영역]   302번지 --> 상수풀 참조
        String str2 = "test";   // 상수풀 [메소드영역]  , 상수풀 참조
        String str3 = "test";   // 상수풀 [메소드영역]  , 상수풀 참조
        String str4 = new String("abc");    // [힙 영역]   402번지 -- > 상수풀 참조
        String str5 = "abc";

        System.out.println(str2 == str3);   // true     // 참조변수의 참조주소가 같다
        System.out.println(str2.equals(str3));  // true

        System.out.println(str1 == str4);   // false    // 참조변수의 참조주소가 다르다
        System.out.println(str1.equals(str4));  // true //


        // [2] 두 문자열 연결하는 방법
            // [2-1] 문자열.concat(문자열2) : 두 문자열을 연결한 새로운 문자열 반환 함수.
        String javaStr = new String("java");
        String androidStr = new String("android");

        System.out.println(">> [1]연결 전 :"+System.identityHashCode(javaStr));   // 연결하기 전 문자열 주소

        javaStr = javaStr.concat(androidStr);
        System.out.println(javaStr);
        System.out.println(">> [1]연결 후 :"+System.identityHashCode(javaStr));   // 연결 후 문자열 주소
            // [2-2] 문자열1 += 문자열2   : += 변수 = 변수+값  문자열뱐수 += 문자열 , 문자열변수 = 문자열 + 문자열
        String html1 = "<div>";
        String html2 = "하하</div>";
        System.out.println(System.identityHashCode(html1));
        html1 += html2;
        System.out.println(html1);
        System.out.println(System.identityHashCode(html1));

            // [2-3] StringBuilder  : 기존 메모리 문자열을 사용하는 문자열 연결 클래스 , 메모리 효율성
        String javaStr2 = new String("java");
        String androidStr2 = new String("android");
        System.out.println(">> [3]연결 전1 :"+System.identityHashCode(javaStr2));

        StringBuilder buffer = new StringBuilder(javaStr2);
        System.out.println(">> [3]연결 전2 :"+System.identityHashCode(buffer));
        buffer.append(androidStr2);
        System.out.println(">> [3]연결 후2 :"+System.identityHashCode(buffer));

        javaStr2 = buffer.toString();

        System.out.println(javaStr2);
        System.out.println(">> [3]연결 후1 :"+System.identityHashCode(javaStr2));

    }
}
