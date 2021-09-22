package com.company;

import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        int e = sc.nextInt();
        int v = e*e;
        int p = v*v;
        int n = p*v;
        int i = n*v;
        System.out.println(p);
        System.out.println(n);
        System.out.println(i);
    }
}