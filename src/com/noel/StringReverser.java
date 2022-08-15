package com.noel;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char c: input.toCharArray()) {
            stack.push(c);
        }
//        char[] temp = new char[input.length()];
//        int index = 0;
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
