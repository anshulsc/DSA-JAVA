package com.company;

public class FindUniqueinArray
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,1,4,1,3,2};
        System.out.print(ans(arr));
    }
    static int ans( int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
