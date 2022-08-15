package com.noel;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int i){
        Node temp = new Node(i);
        temp.assignNext(first);
        first = temp;
        if(last==null)
            last = first;

    }

    public void addLast(int i){
        Node temp = new Node(i);
        if(last == null){
            last = first = temp;
//            first = last;
        }else {
            last.assignNext(temp);
            last = temp;
        }
    }

    public void deleteFirst(){
        if(first == null)
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;
        }
        Node temp = first.getNext();
        first.assignNext(null);
        first = temp;

    }

    public void deleteLast(){
        if(first == null)
            throw new NoSuchElementException();
        if(first == last){
            first = last = null;
            return;
        }
        Node nextToLast = first;
        while(nextToLast.getNext() != last)
        {
            nextToLast = nextToLast.getNext();
        }

        nextToLast.assignNext(null);
        last = nextToLast;
    }

    public int size (){
        int count = 0;
        Node temp = first;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    public boolean contains(int item){
        return this.indexOf(item) != -1;
//        Node current = first;
//        do
//        {
//            if(current.getValue() == item)
//                return true;
//        }while(current.getNext() != null);
//        return false;

    }
    public int indexOf(int item){
        int index = 0;
        Node current = first;

        while(current != null){

            if(current.getValue() == item)
                return index;
            current = current.getNext();
            index++;
        }

        return -1;
    }
    public void print()
    {   Node temp = first;
        do{
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }while(temp != null);

    }

    public int[] toArray(){
        int[] array = new int[size()];
        Node current = first;
        int index = 0;
        while(current != null){
            array[index] = current.getValue();
            index++;
            current= current.getNext();
        }
        return array;
    }
    public void reverse(){
        Node prev = null;
        Node current = first;
        Node next = null;
        while(current != null)
        {
            next = current.getNext();
            current.assignNext(prev);
            prev=current;
            current = next;
        }
//        current.assignNext(prev);
        last = first;
        first = prev;
    }

    public int getKthFromTheEnd(int k){
        if(k<1 || k> size())
            throw new IndexOutOfBoundsException();
        Node current = first;
        Node kth = first;
        int index = 0;
        while (index != k-1){
            current = current.getNext();
            index++;
        }

        while(current.getNext() != null){
            kth = kth.getNext();
            current = current.getNext();
        }
        return kth.getValue();
    }
}
