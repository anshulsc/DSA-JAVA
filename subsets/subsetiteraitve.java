package com.company.subsets;

import java.util.ArrayList;
import java.util.List;

public class subsetiteraitve
{
    public static void main(String[] args) {

        List<List<Integer>> ans = subset(new int[]{1,2,3});
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr)
        {
            int n = outer.size();
            for(int i = 0 ; i<n; i++)
            {
                List<Integer> list = new ArrayList<>(outer.get(i));
                list.add(num);
                outer.add(list);
            }
        }
        return outer;

    }
}
