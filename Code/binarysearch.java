package com.company;

public class binarysearch
{
    public static void main(String[] args)
    {
        int arr[] = {5 , 7  ,9 ,11, 15 , 19, 23};
        int target = 23; 
        int ans = sbinary(arr, target);
        System.out.print(ans);


    }
    static int sbinary(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int middle = start + (end-start)/2 ;
            if (target < arr[middle])
            {
                end = middle - 1;

            }
            else if(target > arr[middle])
            {
                start = middle + 1;
            }
            else
                return middle;
        }

      return -1;
    }
}
