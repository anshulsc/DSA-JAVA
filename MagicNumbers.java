package com.company;

public class MagicNumbers {
    public static void main(String[] args) {
        int n = 1;
        int base = 5;
        int num = 0;
        while(n>0)
        {
            int last = n & 1 ;
            num += last*base;
            base = base*5;
            n =   n>>1 ;
        }
        System.out.println(num);
    }
}
