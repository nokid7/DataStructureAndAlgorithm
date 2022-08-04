package com.noel;

//import com.noel.Array;
public class Main {
    public static void main(String[] args) {
//       arrayTrial();
        LinkedList l = new LinkedList();

        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
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
        l.print();
        System.out.println(l.size());


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
