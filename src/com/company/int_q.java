package com.company;

/**
 * Created by Василий on 06.10.2017.
 */
public class int_q {
    private int q_size;
    private int q_pointer;
    private int [] q_array;

    int_q(int q_size){
        q_array = new int [q_size];
        this.q_size = q_size;
        q_pointer = 0;
    }

    public boolean push (int value){
        if (q_pointer>(q_size-1)) return false;
        q_array[q_pointer]=value;
        q_pointer++;
        return true;
    }

    public int pop (){
        int res = q_array[0];

        int i;
        for (i=0;i<(q_pointer-1);i++)
            q_array[i]=q_array[i+1];

        if (q_pointer > 0){
            q_pointer--;
            return res;
        } else return 0;
    }

    public int get_size (){
        return q_pointer;
    }

    public void print_q (){
        int i;
        for (i=q_pointer-1;i>=0;i--)
            System.out.print(q_array[i] + " ");
        System.out.print("\n");
    }

}
