package Algorithm.Graph;

import java.util.Scanner;
import java.util.Stack;

public class Stack_impl {
	public static void main(String[] args) {
		System.out.println("스택 구현하기");
		
		stack_method_1();
	}
	
	public static void stack_method_1() {
		// Stack 클래스로 구현
		
		 Stack<Integer> stack = new Stack<>();
		 
		 for (int i = 0; i < 5; i++) {
			stack.push(i + 1);
			System.out.println(stack.peek());
		}
		 stack.pop(); // 가장 마지막에 들어간 수를 뺴냄
		 System.out.println(stack.peek()); // 최근에 추가된 Top 빼내기
		 System.out.println(stack.search(1)); // 인자값으로 받은 데이터 위치 반환	1은 4번쨰에 있음
		 
	}
	
	public static void stack_method_2(){
		// 배열로 stack 구현하기 (크기 5짜리)
		
		int top = -1;
		int [] stack = new int [5];
		
		stack[++top] = 3;
        System.out.println("3 넣음");
        stack[++top] = 4;
        System.out.println("4 넣음");
        stack[++top] = 5;
        System.out.println("5 넣음");
        
        System.out.println(stack[top--]+" 나옴");
        System.out.println(stack[top--]+" 나옴");
        System.out.println(stack[top--]+" 나옴");
		
	}

}
