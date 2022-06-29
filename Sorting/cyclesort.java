package com.company.Sorting;

import java.util.Arrays;

public class cyclesort
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,4,1,5};
        cycle(arr);
        System.out.print(Arrays.toString(arr));


    }
    static void cycle(int[] arr)
    {
        int n = 0;
        while(n<arr.length)
        {
            int correct = arr[n]-1;
            if(arr[correct] != arr[n])
            {
                swap(arr,correct,n) ;
            }
            else
            {
                n++;
            }
        }
    }
    static void swap(int[] arr , int c, int n)
    {
        int temp = arr[c];
        arr[c] = arr[n];
        arr[n]  = temp;

    }
}
