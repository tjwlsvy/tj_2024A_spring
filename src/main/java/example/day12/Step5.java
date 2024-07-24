package example.day12;

import java.util.*;

public class Step5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String , Integer> map = new HashMap<>();

        while (true) {
            int ch = scan.nextInt();
            System.out.println(" 1.등록 , 2.전체출력 , 3.수정 , 4.삭제 : ");
            if (ch == 1) {
                System.out.println("등록할 이름 :");
                String name = scan.next();
                System.out.println("등록할 나이 :");
                int age = scan.nextInt();
                User user = new User();
                user.name = name;
                user.age = age;
                map.put(name,age);

            }
            if (ch == 2) {
                map.keySet().forEach(key-> {
                    System.out.printf("%s\t%d\n", key , map.get(key));
                });
            }
            if (ch == 3) {
                System.out.println("수정할 이름 :");
                String name = scan.next();
                map.keySet().forEach(key->{
                    if (key.equals(name)){
                        System.out.println("수정할 나이 :"); int age = scan.nextInt();
                        map.put(key , age);
                        // map.replace(key , age); // 수정
                    }
                });


            }
            if (ch == 4) {
                System.out.println("삭제할 이름:");String name = scan.next();
                map.remove(name);


            }
        }
    }




}
