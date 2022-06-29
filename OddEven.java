package com.company;
public class OddEven
{
    public static void main(String[] args)
    {
    int a = 89;
    System.out.print(isodd(a));
    }

    static boolean isodd(int n)
    {
        return (n & 1) == 1;
    }
}

