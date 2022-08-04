package com.noel;
//Nodes used for linked list
public class Node {
    private int value = 0;
    private Node next;

    public Node(int item){
        this.value = item;
    }

    public void assignNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public void assignValue(int item){
        this.value = item;
    }
    public int getValue(){
        return this.value;
    }
}
