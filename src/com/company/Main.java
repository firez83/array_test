package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int_q q = new int_q(10);

        q.push(100);
        q.push(200);
        q.push(300);
        q.print_q();

        int j;

        j=q.pop();
        q.print_q();

    }
}
