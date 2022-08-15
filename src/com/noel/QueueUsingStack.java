package com.noel;
import java.util.Arrays;
import java.util.Stack;
public class QueueUsingStack {
    private Stack<Integer> primary = new Stack();
    private Stack<Integer> secondary = new Stack();
    public void enqueue(int item){
//        if(count==size)
//            throw new IllegalStateException();
//        while(!primary.empty()){
//            secondary.push(primary.pop());
//        }
//        primary.push(item);
//        while(!secondary.empty()){
//            primary.push(secondary.pop());
//        }
//        count++;
        primary.push(item);
    }

    public int dequeue(){
        if(this.isEmpty())
            throw new IllegalStateException();

        movePrimaryToSecondary();

        return secondary.pop();
    }
    public int peek(){
        if(this.isEmpty())
            throw new IllegalStateException();

        movePrimaryToSecondary();

        return secondary.peek();
    }

    private void movePrimaryToSecondary() {
        if(secondary.isEmpty())
            while(!primary.empty())
                secondary.push(primary.pop());
    }

    public boolean isEmpty(){
        return primary.isEmpty() && secondary.isEmpty();
    }
//    public boolean isFull(){
//        return count == size ;
//    }

//    @Override
//    public String toString(){
//       return Arrays.toString(primary.toArray());
//    }
}
