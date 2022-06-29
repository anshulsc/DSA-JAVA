package com.company;


import java.util.Arrays;

public class FirstandLast
{
    public static void main(String[] args)
    {
        int in[] = {1,2,4,4,7,7,7,7,9,13};
        int target = 4;
        int answer[] = res(in, target);
        System.out.print(Arrays.toString(answer));

    }
    static int[] res(int[] arr , int target)
    {
        int ans[] = {-1,-1};
        ans[0] = binarysearch(arr, target, true);
        if(ans[0] != -1)
        {
            ans[1] = binarysearch(arr, target,false);
        }
        return ans;
    }
    static int binarysearch(int[] arr , int target , boolean startindex)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int middle = start + (end-start)/2 ;
            if(target < arr[middle])
            {
                end = middle - 1;
            }
            else if(target > arr[middle])
            {
                start = middle + 1;
            }
            else
            {
                ans = middle;
                if (startindex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }

        }
        return ans;

    }
}
