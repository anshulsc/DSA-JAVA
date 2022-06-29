package com.company;

public class ceiling
{
    public static void main(String[] args)
    {
        int arr[] = {4, 6, 8, 9,12, 14,15,23,25,26,37,65};
        int target = 13;
        int ans = sbinary(arr, target);
        System.out.print("" + arr[ans]);


    }
    static int sbinary(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int middle = start + (end-start)/2 ;
            if (target<arr[middle])
            {
                end = middle - 1;

            }
            else if(target>arr[middle])
            {
                start = middle + 1;
            }
            else
                return middle;
        }

        return start;
    }
}
