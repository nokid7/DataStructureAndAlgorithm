package com.noel;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    int index;
    int size;

    public PriorityQueue(int size){
        super();
        items= new int[size];
        this.size = size;
    }

    public void enqueue(int item){
        if(index==size)
            throw new IllegalStateException();

        int i;
        for (i = index-1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        items[i + 1] = item;
        index++;

    }

    public int dequeue(){
        int r = items[0];
        items[0]=0;
        System.out.println("index"+index);
        for (int i=1;i<index;i++)
        {
            items[i-1]=items[i];
        }
        for(int i=index-1;i<size;i++)
            items[i]=0;
        index--;
        return r;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
