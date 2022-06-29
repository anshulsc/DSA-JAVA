package com.company;
// Count Steps taken to make a number zero acc to given constraints
public class CountSteps
{
    public static void main(String[] args)
    {
        System.out.println(count(14));
    }

    // Constraints : If number is even then divide by 2 else subtract 1
    static int count( int n)
    {
        return helper(n,0);
    }
    static int helper( int n , int c)
    {
        if(n == 0)
        {
            return c;
        }
        if( n % 2 == 0)
        {
            return helper(n/2,c+1);
        }
        else return helper( n - 1 , c+1);
    }
}
