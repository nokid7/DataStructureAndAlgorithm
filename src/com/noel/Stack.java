package com.noel;

public class Stack {
    int[] stack = new int[3];
    int size = 0;
    public void push(int element){
        if(stack.length <= size){
            int[] temp = new int[stack.length*2];
            for(int i=0; i<stack.length;i++)
                temp[i] = stack[i];
            stack = temp;
        }
        stack[size++] = element;
//        size++;
    }

    public int pop(){
        if(size==0)
            throw new IndexOutOfBoundsException();
//        size--;
        int lastElement = stack[--size];
//        stack[size] = 0;

        return lastElement;
    }

    public int peek(){
        return stack[size-1];
    }

    public boolean isEmpty(){
        return size==0;
    }
}


