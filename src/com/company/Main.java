package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int rows = 10;
        int cols = 5;
        int a[][] = new int[rows][cols];
        int b[][];
        int r,c;
        b=a;

        System.out.println(a.length);
        System.out.println(a[0].length);

        for (r=0;r<rows;r++){
            for (c=0;c<cols;c++){
                a[r][c]=(r+1)*(c+1);
                System.out.print(b[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
}
