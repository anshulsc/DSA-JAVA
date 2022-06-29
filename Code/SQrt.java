package com.company;

public class SQrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf(" %.3f " ,binarysqrt(40 ,3));
    }
    static double sqrt(int n , int p){

        double root = 0.0;
        double incr = 1;
        for(int i = 0 ; i<p+1 ; i++)
        {
            while(root * root <= n)
            {
                root += incr;
            }
            root -= incr;
            incr = incr/10;

        }
        return  root;
    }
    static double binarysqrt(int n , int p)
    {
        int s = 0;
        int e = n;
        double root = 0.0;
        while( s <= e)
        {
            int m = s + (e-s)/2;

            if(m * m == n)
            {
                return m;
            }
            if(m * m > n)
            {
                e =  m - 1;
            }
            else
            {
                s = m + 1;
                root = m;
            }

        }
        double incr = 0.1;
        for(int i = 0 ; i<p ; i++)
        {
            while(root * root <= n)
            {
                root += incr;
            }
            root -= incr;
            incr = incr/10;

        }
        return  root;
    }
}
