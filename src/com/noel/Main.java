package com.noel;

//import com.noel.Array;
public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(2);
        System.out.println(numbers.indexOf(40));
//        numbers.removeAt(1);
//        numbers.removeAt(1);
//        numbers.removeAt(3);
        numbers.print();
    }
}