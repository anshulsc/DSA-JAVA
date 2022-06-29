package com.company.Sorting;

import java.util.Arrays;

public class maxheap
{
    public static void main(String[] args)
    {
        int arr[] = { 0,6,5,2,4,7,3,1};
        heap_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void max_heapify(int Arr[],int i,int N )
    {
         int left = 2*i;
         int right = 2*i  + 1;

         int largest = i;

         if( left <=N && Arr[i] < Arr[left])
         {
             largest = left;
         }
         if( right <= N && Arr[right] > Arr[largest])
         {
             largest = right;
         }
         if(largest != i)
         {
             swap(Arr,i,largest);
             max_heapify(Arr,largest ,N);
         }
    }

    static void build_heap(int Arr[])
    {
        int N = Arr.length - 1;
        for(int i = N/2 ; i>0 ; i--)
        {
            max_heapify(Arr,i ,N);
        }

    }

    static void swap(int Arr[] , int i , int largest)
    {
        int temp = Arr[i];
        Arr[i] = Arr[largest];
        Arr[largest] = temp;
    }

    static void heap_sort(int Arr[])
    {
        int N = Arr.length - 1;
        build_heap(Arr);

        for(int i = N ; i > 1 ; i--)
        {
            swap(Arr,1,i);
            max_heapify(Arr,1,i-1);

        }


    }

}
