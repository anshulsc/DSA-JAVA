package com.company;

public class AQ
{
    public static void main(String[] args) {

        ret( new int[]{5,3,-3,1,2,-2,-1});
    }
    static void ret(int[] arr)
    {
       boolean ans;
        int an;
        for(int i =0 ; i < arr.length ; i++)
        {
            ans = false;
            for( int j =0 ; j<arr.length ; j++)
            {
                if(arr[i] ==  - arr[j])
                {
                    ans = true;
                }

            }
            if(ans == false)
            {
                System.out.println(arr[i]);
            }

        }
    }
}

