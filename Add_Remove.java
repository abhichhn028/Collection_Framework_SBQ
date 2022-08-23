package com.classAndObject;

import java.util.*;

public class Add_Remove_Queue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> Q=new LinkedList<>();

//        Adding 6 Element
        for(int i=0;i<5;i++)
        {
            Q.add(sc.nextInt());
        }

//        Remove 2 Element and Print
        for(int i=0;i<2;i++)
        {
            System.out.println(Q.remove());
        }

//        Print Remaining Element
        System.out.println(Q);
    }
}
