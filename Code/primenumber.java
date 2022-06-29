package com.company;

public class primenumber {
    public static void main(String[] args) {
        int n = 13;
        for(int i = 1 ; i<= 13 ; i++)
        {
            System.out.println( i + " is prime : " + isPrime(i));
        }
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c = 2;
        while( c*c <= n)
        {
            if( n % c == 0)
            {
                return false;
            }
            c++;
        }
        return true;

    }
}
