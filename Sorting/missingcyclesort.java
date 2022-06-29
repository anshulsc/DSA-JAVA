package com.company.Sorting;

import java.util.Arrays;

public class missingcyclesort
{
    public static void main(String[] args) {
        int[] arr = {2,3,1,0};
         int miss = missing(arr);

        System.out.println(Arrays.toString(arr));
        System.out.print("" + miss);

    }
    static int missing(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if (( arr[i] < arr.length) && (arr[correct] != arr[i]))
            {
                swap(arr,correct,i);
            }
            else
            {
                i++;
            }
        }
        for(int j = 0 ; j<arr.length; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
