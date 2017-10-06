package com.company;

/**
 * Created by Василий on 06.10.2017.
 */
public class int_q {
    private int q_size;
    private int q_pointer;
    private int [] q_array;

    void int_q(int q_size){
        q_array = new int [q_size];
        this.q_size = q_size;
    }

    public boolean push (int value){
        return true;
    }

    public int pop (){
        return 0;
    }

    public int get_size (){
        return q_pointer;
    }

    public void print_q (){

    }

}
