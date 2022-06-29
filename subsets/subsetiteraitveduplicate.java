package com.company.subsets;

import java.util.ArrayList;
import java.util.List;

public class subsetiteraitveduplicate
{
    public static void main(String[] args) {

        List<List<Integer>> ans = subset(new int[]{1,2,2,3});
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0 ; i<arr.length ; i++)
        {
            start = 0;

            if(i>0 && arr[i] == arr[i-1])
            {
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();

            for(int j = start; j<n ; j++)
            {
                List<Integer> list = new ArrayList<>(outer.get(j));
                list.add(arr[i]);
                outer.add(list);
            }
        }
        return outer;

    }
}
