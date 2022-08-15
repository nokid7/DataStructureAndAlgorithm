package com.noel;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

//import com.noel.Array;
public class Main {
    public static void main(String[] args) {
//       arrayTrial();
//        linkedListTrial();
//        stringReverser();
//        balancedExpression();
//            stack();
//        System.out.println(isDigitIncrease(108));
//        queue();
//        queueUsingStacks();
        PriorityQueue pq = new PriorityQueue(6);
        pq.enqueue(4);
        pq.enqueue(1);
        System.out.println(pq.dequeue());
        System.out.println(pq);
        pq.enqueue(3);
        System.out.println(pq);
        pq.enqueue(2);
        System.out.println(pq);
        pq.enqueue(6);
        pq.enqueue(7);
        System.out.println(pq);
        pq.enqueue(1);
        System.out.println(pq);
//        pq.enqueue(2);
        System.out.println(pq.dequeue());
        System.out.println(pq.dequeue());
        System.out.println(pq.dequeue());

        System.out.println(pq);
    }

    private static void queueUsingStacks() {
        QueueUsingStack qus = new QueueUsingStack();
        qus.enqueue(10);
        qus.enqueue(20);
        System.out.println(qus.dequeue());
        qus.enqueue(30);
        qus.enqueue(40);
        System.out.println(qus.dequeue());
        System.out.println(qus.dequeue());
    }

    public static void queue(){
//        Queue<Integer> q = new ArrayDeque<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        reverse(q);
//        System.out.println(q);
        ArrayQueue aq = new ArrayQueue(5);
        System.out.println(aq.isEmpty());
        System.out.println(aq.isFull());
        System.out.println(aq);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        System.out.println(aq);
        System.out.println(aq.dequeue());
        System.out.println(aq);
        aq.enqueue(40);
        aq.enqueue(50);
        System.out.println(aq.dequeue());
        System.out.println(aq);
        aq.enqueue(60);
        aq.enqueue(70);
        System.out.println(aq);


    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> reverserStack = new Stack();
        while(!queue.isEmpty()){
            reverserStack.push(queue.remove());
        }
        while(!reverserStack.empty()){
            queue.add(reverserStack.pop());
        }
    }
//    public static int isDigitIncrease(int num){
//        int divider = 0;
//        for(int i=1; divider<=num; i++) {
//            divider = (divider * 10) + i;
//            if(num%divider == 0 && num/divider < 10 ) return 1;
//        }
//        return 0;
//    }
    public static void stack(){
        MinStack s = new MinStack();
//        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(5);
        s.push(5);

//        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.min());

//        s.pop();
//        s.pop();
//        System.out.println(s.isEmpty());

    }
    public static void balancedExpression(){
        BalancedExpression be = new BalancedExpression();
        System.out.println(be.isBalanced("[((1)+(<1>))]"));
    }
    public static void stringReverser(){
        StringReverser sr = new StringReverser();
        String reversed = sr.reverse("abcd");
        System.out.println(reversed);
    }
    public static void linkedListTrial(){

        LinkedList l = new LinkedList();

        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
//        l.addLast(40);
        System.out.println(Arrays.toString(l.toArray()));
//        l.addFirst(10);
//        l.addFirst(20);
//        l.addLast(100);
//        l.addLast(200);
//        System.out.println(l.contains(20));
//        System.out.println(l.indexOf(880));
////        l.deleteFirst();
////        l.deleteFirst();
//        l.deleteLast();
////        l.deleteLast();
//        l.reverse();
//        l.print();
        System.out.println(l.getKthFromTheEnd(1));
//        System.out.println(Arrays.toString(l.toArray()));
//        System.out.println(l.size());

    }
    public static void arrayTrial()
    {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        System.out.println(numbers.indexOf(40));
//        numbers.removeAt(1);
//        numbers.removeAt(1);
//        numbers.removeAt(3);
        numbers.print();
    }
}
