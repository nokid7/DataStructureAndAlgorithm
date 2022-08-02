package com.noel;

public class Array {
    private int[] number;
    private int position = 0;
    public Array(int length){
        this.number= new int[length];
    }

    public void insert(int item){
        if(this.position == this.number.length) {
            int[] temp = new int[this.position + 1];
            for (int i = 0; i < this.position; i++) {
                temp[i] = this.number[i];
            }
            this.number = temp;
        }
            this.number[position] = item;
            this.position++;

    }

    public void print(){
        for(int i=0; i<this.position; i++)
        {
            System.out.println(this.number[i]);
        }
    }

    public void removeAt(int index){
        int[] temp = new int[this.position];
        for (int i=0,j=0;i<this.position;i++,j++) {
            if(i!=index)
            {
                temp[j] = this.number[i];
            }else{
                j--;
                this.position--;
            }
        }
        this.number = temp;
    }
    public int indexOf(int num){
        int value = -1;
        for(int i=0; i<this.position; i++)
        {
            if(this.number[i] == num)
            {
                value=i;
                break;
            }
        }
        return value;
    }
}
