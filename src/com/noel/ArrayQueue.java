package com.noel;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayQueue {
    private int front;
    private int rear;
    private int count;
    private int[] items = {};

    public ArrayQueue(int numOfItems){
        super();
        items= new int[numOfItems];
    }
    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException();

        rear=rear%items.length;

        items[rear++]=item;
        count++;
    }
    public int dequeue(){
        if(count == 0)
            throw new IllegalStateException();

        front=front%items.length;
        count--;
        return items[front++];
    }

    public int peek(){
        return items[front];
    }

    public boolean isEmpty(){
        return front == rear;
    }
    public boolean isFull(){
        return rear == items.length;
    }

    public int[] toArray()
    {
        if(count==0)
            return new int[0];
        else if(front<rear)
            return Arrays.copyOfRange(items, front, rear);
        else{
            int[] temp1 = Arrays.copyOfRange(items, front, items.length );
            int[] temp2 = Arrays.copyOfRange(items, 0, rear);
            return IntStream.concat(Arrays.stream(temp1), Arrays.stream(temp2)).toArray();
        }

    }
    @Override
    public String toString(){
        return Arrays.toString(this.toArray());
    }
}
