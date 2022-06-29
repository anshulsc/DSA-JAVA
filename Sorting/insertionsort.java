package com.company.Sorting;

import java.util.Arrays;

public class insertionsort
{
    public static void main(String[] args)
    {
        int[] arr = {1,4,3,7,6,5};
        sort(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void sort(int[] arr)
    {
        for(int i = 0 ; i< arr.length-1 ; i++)
        {
            for(int j = i+1 ; j>0 ; j--)
            {
                if (arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else if (arr[j]>arr[j-1])
                {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr , int i , int k)
    {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
