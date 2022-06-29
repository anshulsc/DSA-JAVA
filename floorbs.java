package com.company;

public class floorbs
{

        public static void main(String[] args)
        {
        int input[] = {2, 4, 6,8, 9, 12, 14, 17,19};
        int target = 10 ;
        int ans = floorbinary(input,target);
        System.out.print(input[ans]);
        }
    static int floorbinary(int arr[],int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int middle = start + (end - start)/2;
            if(target<arr[middle])
            {
                end = middle-1;
            }
            else if(target>arr[middle])
            {
                start = middle + 1;
            }
            else
                return middle;
        }
        return end;
    }


}
