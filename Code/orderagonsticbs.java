package com.company;

public class orderagonsticbs
{
    public static void main(String[] args)
    {
        int[] arr = {7,6,5,3,2,1};
        int target = 2;
        System.out.print(order(arr,target));
    }
    static int order(int[] arr , int target)
    {
        int start = 0;int end = arr.length -1;
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
