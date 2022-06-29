package com.company;

public class findmountedarray
{
    public static void main(String[] args)
    {
        int arr[] = {1,3,6,7,8,5,4,3,2,1};
        int target = 2;
        System.out.print(bs(arr,target));
    }
    static int bs(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;
        int peak = findpeak(arr);
        int targetindex = order(arr,target,start,peak);
        if(targetindex == -1)
        {
           targetindex = order(arr,target,peak,end);
        }
     return targetindex;
    }
    static int findpeak(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int middle = start + (end - start)/2;
            if(arr[middle] > arr[middle + 1])
            {
                end = middle;
            }
            else
                start = middle + 1;
        }
        return start;

    }
    static int order(int[] arr , int target, int start , int end)
    {
        if (arr[start]>arr[end])
        {
        while(start <= end)
        {
            int middle = start + (end - start)/2;
            if (target > arr[middle])
            {
                end = middle - 1;
            }
            else if(target < arr[middle])
            {
                start = middle + 1;
            }
            else
                return middle;

        }
    }
    else
        while(start <= end)
        {
            int middle = start + (end - start) / 2;
            if (target < arr[middle])
            {
                end = middle - 1;
            }
            else if (target > arr[middle])
            {
                start = middle + 1;
            } else
                return middle;
        }


    return -1;
}
}
