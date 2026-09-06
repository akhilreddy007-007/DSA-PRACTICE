package day_5.Array_List;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test {
public static void main(String[] args) {
PriorityQueue<Integer> minPQ = new PriorityQueue<>();
minPQ.offer(30);
minPQ.offer(10);
minPQ.offer(20);
System.out.println("Peek: " + minPQ.peek());
System.out.println("Poll: " + minPQ.poll());
System.out.println("Poll: " + minPQ.poll());
PriorityQueue<Integer> maxPQ =
new PriorityQueue<>(Collections.reverseOrder());
maxPQ.offer(30);
maxPQ.offer(10);
maxPQ.offer(20);
System.out.println("Max poll: " + maxPQ.poll());
System.out.println("Peek: " + minPQ.peek());
}
}