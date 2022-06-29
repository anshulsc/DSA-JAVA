package com.company;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args)
    {
        factor1(18);
    }


    // O(n)
    static void factor(int n )
    {
        for(int i = 1; i<= n ; i++)
        {
            if(n%i== 0)
            {
                System.out.print(i + " ");
            }
        }

    }


    //O(sqrt(n))
    static void factor1( int n )
    {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 1; i*i<=n ; i++)
        {
            if( n % i == 0)
            {
                if(n/i == i)
                {
                    System.out.print(i + " ");
                }
                else
                    System.out.print(i + " ");
                    List.add(n/i);
            }
        }
        for(int j = List.size() - 1; j>=0 ; j--)
        {
            System.out.print(List.get(j) + " ");
        }


    }
}
