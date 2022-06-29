package com.company;

public class Fibbonaci_formula {
    public static void main(String[] args)
    {
         System.out.println(formula(50));
         outnum(10);
    }

    static int formula( int n)
    {
        return  (int) ((Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2,n))/ Math.sqrt(5));
    }


    static void outnum(int n )
    {
        for(int i = 0; i <= n ;i++)
        {
            System.out.println(formula(i));
        }
    }
}
