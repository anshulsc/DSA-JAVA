package com.company;

public class infinitebinarysearch
{
    // Used when the array is infinite or you don't want to know the length of array
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 7,8,12, 15 ,19};
        int target = 5;
        int ans = findindex(arr,target);
        System.out.print(ans);

    }
    static int findindex(int[] arr , int target)
    {
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarys(arr ,target ,start ,end);
    }
    static int binarys(int[] arr , int target , int start , int end)
    {
        while(start<= end)
        {
            int middle = start +(end-start)/2;
            if(target > arr[middle])
            {
                start = middle + 1;
            }
            if(target < arr[middle])
            {
                end = middle - 1;
            }
            else
                return middle;
        }
        return -1;
    }
}
