package com.company;

public class peakofmountedarray
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,5,6,4,3,2,1};
        int ans = findpeak(arr);
        System.out.print(ans);
    }
    static int findpeak(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int middle = start + (end - start)/2;
            if(arr[middle] < arr[middle + 1])
            {
                start = middle + 1;
            }
            else
            {
                end = middle;
            }

        }
        return start;

    }

}
