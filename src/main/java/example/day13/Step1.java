package example.day13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Step1 {
    public static void main(String[] args) {


        // 1, 스택
        Stack<Integer> coinBox = new Stack<>();

        // 2. 스택에 push
        coinBox.push(100);
        coinBox.push(50);
        coinBox.push(500);
        coinBox.push(10);
        System.out.println("coinBox = " + coinBox);

        // 4. 스택 // topData = 10
        int topData = coinBox.peek();
        System.out.println("topData = " + topData);

        // 3. 스택의 pop
        coinBox.pop(); //coinBox = [100, 50, 500]
        System.out.println("coinBox = " + coinBox);

        coinBox.pop(); // coinBox = [100, 50]
        System.out.println("coinBox = " + coinBox);

        coinBox.pop(); // coinBox = [100]
        System.out.println("coinBox = " + coinBox);

        coinBox.pop(); // coinBox = []
        System.out.println("coinBox = " + coinBox);

        // 5. 큐
        Queue<Integer> pointBox = new LinkedList<>();

        // 6. 큐 dequeue
        pointBox.offer(100);
        pointBox.offer(50);
        pointBox.offer(500);
        pointBox.offer(10);
        System.out.println("pointBox = " + pointBox);

        // 7. 큐 peek
        int frontData = pointBox.peek();
        System.out.println("frontData = " + frontData);

        // 8. dequeue
        pointBox.poll();
        System.out.println("pointBox = " + pointBox);
        pointBox.poll();
        System.out.println("pointBox = " + pointBox);
        pointBox.poll();
        System.out.println("pointBox = " + pointBox);
        pointBox.poll();
        System.out.println("pointBox = " + pointBox);










    }
}
