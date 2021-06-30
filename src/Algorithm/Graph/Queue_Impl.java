package Algorithm.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Impl {
	public static void main(String[] args) {
		Queue<Integer> intQueue = new LinkedList<>(); // Int 형  queue 선언, linkedlist 이용
		Queue<String> stringQueue = new LinkedList<>(); //String형 queue 선언, linkedlist 이용
		
		intQueue.add(1);
		intQueue.add(2);
		intQueue.offer(3);

	}

}
