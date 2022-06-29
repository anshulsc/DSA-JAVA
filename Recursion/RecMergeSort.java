package com.company.Recursion;

import java.util.*;

public class RecMergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {3,4,1,5,9,8};
        int[] narr = sort(arr);
        System.out.println(Arrays.toString(narr));

    }
    static int[] sort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first , int[] second)
    {
        int[] newone = new int[ first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < first.length && j < second.length)
        {
             if(first[i]<second[j])
             {
                newone[k] = first[i];
                i++;
             } else
             {
                 newone[k] = second[j];
                 j++;
             }
             k++;
        }
        while(i < first.length)
        {
            newone[k] = first[i];
            i++;
            k++;
        }
        while( j < second.length)
        {
            newone[k] = second[j];
            j++;
            k++;
        }
        return newone;
    }
}
