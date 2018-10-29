package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int A = 0;
        int B = 1;

        for (int i = 3; i < 10; i++)
        {
            A = A + (int) Math.pow(i, 2);

        }

        System.out.println("A = " + A);

        for (int i = 2; i < 9; i++)
        {
            B = B * i;
        }

        System.out.println("B = " + B);
        System.out.println("C = " + (A + B));
    }
}

