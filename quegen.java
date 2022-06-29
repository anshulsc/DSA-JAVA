package com.company;

import java.util.ArrayList;

public class quegen {
    public static void main(String[] args) {
     int[][] arr = {{1,1,1,0,0,0},
                    {0,1,0,0,0,0},
                    {1,1,1,0,0,0},
                    {0,0,0,0,0,0},
                    {0,0,0,0,0,0},
                    {0,0,0,0,0,0}};
     int[][] bz = {{1,1,1,0,0,0},
                   {0,1,0,0,0,0},
                   {1,1,1,0,0,0},
                   {0,0,2,4,4,0},
                   {0,0,0,2,0,0},
                   {0,0,1,2,4,0}};
     hour(bz);
     hour(arr);
    }

    static void hour(int[][] arr) {
        int size = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length-3; i++)
        {
            for (int j = 0; j <= arr.length - 3; j++)
            {
                {
                    int ans = arr[i][j] + arr[i+2][j] + arr[i][j+1] +
                            arr[i+2][j+1] + arr[i][j+2] + arr[i+2][j+2] + arr[i+1][j+1];
                    list.add(ans);
                    size ++;
                }
            }
        }
        System.out.println(list);
        int max = list.get(0);
        for(int i = 0 ; i< list.size(); i++)
        {
            if( max < list.get(i))
            {
                max = list.get(i);
            }
        }
        System.out.println("The max is " + max);
        System.out.println("Size is " + size);
    }

}
