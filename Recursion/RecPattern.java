package com.company.Recursion;

public class RecPattern {
    public static void main(String[] args) {
        triangle(4,0);
    }

    //method1
    static void pat(int n)
    {
        if(n == 0)
        {
            return;
        }
        for(int i  = 1 ; i<= n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        pat(n-1);

    }

    //method2
    static void triangle(int r , int c)
    {
        if( r == 0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            triangle(r , c+1);
        }
        else
        {
            System.out.println();
            triangle(r-1,0);
        }
    }
}
