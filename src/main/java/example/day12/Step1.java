package example.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Step1 {
    public static void main(String[] args) {
        
        // 1. HashSet 선언
        Set<String> set = new HashSet<>();
        
        // 2.
        set.add("임정순");
        set.add("박현정");
        set.add("홍연의");
        set.add("강감찬");
        set.add("강감찬"); // 중복을 허용하지 않는다.
        
        // 3. 
        System.out.println("set = " + set);
        
        // 4. 
        int size = set.size();
        System.out.println("size = " + size);

        // 5.
        set.remove("강감찬");
        System.out.println("set = " + set);

        // 6.
        boolean bool = set.contains("홍연의");
        System.out.println("bool = " + bool);
        
        // 7. set 컬렉션 순회 방법
            // set 인덱스 없으므로 .get() 사용불가.
        // (1)
        for (int i = 0; i < set.size(); i++){
            //set.get(i) // 오류 : 인덱스가 없음
        }
        Iterator<String> rs = set.iterator();
        while (rs.hasNext()){
            System.out.println("rs.next() = " + rs.next());            
        }
        // (2) 향상된 반복문
        for (String s : set){
            System.out.println("s = " + s);
        }
        // (3) froEach : 리턴값 없다.
        set.forEach(s->{
            System.out.println("s = " + s);
        });
        // (4) stram().map() : 리턴값이 있다.
        Set<String> newSet = set.stream().map(s->{return s;})
                                        .collect(Collectors.toSet());
        System.out.println("newSet = " + newSet);
        
        // - 중복제거 한다고 했는데. 만약에 필드가 2개 이상인 객체이면 ??
        Set<Member> memberSet = new HashSet<>();
        // 
        memberSet.add(new Member(1001 , "이지원"));
        memberSet.add(new Member(1002 , "손민국"));
        memberSet.add(new Member(1003 , "박서훤"));
        //
        System.out.println("memberSet = " + memberSet);
        //
        memberSet.add(new Member(1003 ,"박서훤"));
        System.out.println("memberSet = " + memberSet);
        
        
        
        
    }

}
