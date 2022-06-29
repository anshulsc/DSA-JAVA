package com.company.Sorting;

import java.util.Arrays;

public class bubble
{
    public static void main(String[] args)
    {
        int[] arr = {2,6,3,1,5,4};
        sort(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void sort(int[] arr)
    {

        for(int i = 0 ; i<arr.length; i++)
        {
            boolean swap = false;
            for(int j = 0 ; j<arr.length - 1- i ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

            }
            if(!swap)
            {
                break;
            }
        }



    }
}
