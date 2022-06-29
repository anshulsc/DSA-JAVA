package com.company.Recursion;

import java.util.Arrays;

public class RecMergeinPlacce
{
    public static void main(String[] args) {
        int[] arr = {3,2,1,8,7,9};
        merge( arr , 0 , arr.length);
        System.out.print(Arrays.toString(arr));

    }
    static void merge(int[] arr , int s , int e)
    {
        if( e - s == 1)
        {
            return;
        }
        int m = (s+e) /2;
        merge( arr , s , m);
        merge(arr , m , e);

        mergeinplace( arr ,s,m ,e);

    }
    static void mergeinplace(int[] arr , int s , int m , int e )
    {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while( i < m && j < e)
        {
            if( arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while( i < m)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while( j < e)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
         for( int l = 0 ; l < mix.length ; l++)
         {
             arr[s+l] =  mix[l];
         }


    }
}
