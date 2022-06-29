package com.company.Sorting;

import java.util.Arrays;

public class selection
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,3,1,2};
        selectsort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selectsort(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            int last = arr.length-1-i;
            int maxindex = getmaxindex(arr, 0 , last);
            swap(arr,maxindex,last);
        }

    }
    static int getmaxindex( int[] arr, int start , int last)
    {
        int max = start;
        for(int i = 0 ; i <= last ; i++)
        {
            if(arr[max]<arr[i])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr ,int max,int last)
    {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;

    }
}