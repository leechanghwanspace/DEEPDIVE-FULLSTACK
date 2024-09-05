package org.example;

import org.example.LinkedList.LinkedList;
import org.example.Queue.Queue;
import org.example.Stack.Stack;

public class Main {
    public static void main(String[] args) {
        // LinkedList 테스트
        System.out.println("LinkedList 테스트 시작");
        LinkedList<String> linkedList = new LinkedList<>();

        // 데이터 추가
        System.out.println("\n*데이터 추가*");
        linkedList.add("A");
        System.out.println("'A' 추가됨");
        linkedList.add("B");
        System.out.println("'B' 추가됨");
        linkedList.add("C");
        System.out.println("'C' 추가됨");
        linkedList.add("D");
        System.out.println("'D' 추가됨");

        // 리스트 크기 및 첫 번째 데이터 확인
        System.out.println("\n*리스트 정보*");
        System.out.println("LinkedList 크기: " + linkedList.size());
        System.out.println("첫 번째 데이터: " + linkedList.get(0));

        // Queue 테스트
        System.out.println("\nQueue 테스트 시작");
        Queue<String> queue = new Queue<>();

        // 데이터 추가
        System.out.println("\n*데이터 추가*");
        queue.enqueue("A");
        System.out.println("'A' 큐에 추가됨");
        queue.enqueue("B");
        System.out.println("'B' 큐에 추가됨");
        queue.enqueue("C");
        System.out.println("'C' 큐에 추가됨");
        queue.enqueue("D");
        System.out.println("'D' 큐에 추가됨");

        // 큐 크기 및 첫 번째 데이터 확인
        System.out.println("\n*큐 정보*");
        System.out.println("Queue 크기: " + queue.size());
        System.out.println("첫 번째 데이터 제거: " + queue.dequeue());

        // Stack 테스트
        System.out.println("\nStack 테스트 시작");
        Stack<String> stack = new Stack<>();

        // 데이터 추가
        System.out.println("\n*데이터 추가*");
        stack.push("A");
        System.out.println("'A' 스택에 추가됨");
        stack.push("B");
        System.out.println("'B' 스택에 추가됨");
        stack.push("C");
        System.out.println("'C' 스택에 추가됨");
        stack.push("D");
        System.out.println("'D' 스택에 추가됨");

        // 스택 크기 및 맨 위의 데이터 확인
        System.out.println("\n*스택 정보*");
        System.out.println("Stack 크기: " + stack.size());
        System.out.println("맨 위의 데이터 제거: " + stack.pop());
    }
}
