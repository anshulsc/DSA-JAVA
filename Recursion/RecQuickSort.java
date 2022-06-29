package com.company.Recursion;

import java.util.Arrays;

public class RecQuickSort
{
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sort(arr,0,arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[] arr , int low , int hi)
    {
        if(low>=hi)
        {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int p = arr[m];
        while(s <= e)
        {
            while(arr[s] < p)
            {
                s++;
            }
            while(arr[e] > p)
            {
                e--;
            }
            if(s <= e)
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        sort(arr,low , e);
        sort(arr , s , hi);
    }
}
