package com.company.Sorting;

import java.util.Arrays;

public class bubblesortmine
{
    public static void main(String[] args)
    {
        int[] arr= {3,1,5,4,2};
        int[] sort = ans(arr);
        System.out.print(Arrays.toString(sort));

    }
    static int[] ans(int[] arr)
    {
        int length = arr.length - 1;
        int n = 0;
        int j = arr.length-2;
        while(n<length)
        {
            int temp;
            n++;
            for(int i = 0 ; i<=j ; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            j--;

        }
        return arr;
    }
}
