package com.company.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RecLinearSearch {
    public static void main(String[] args)
    {
        int[] arr = {7,2,4,6,8,7,7,9};
        int t = 7;
        ArrayList<Integer> ans = findIndex(arr , t ,0 , new ArrayList<>());
        System.out.print(ans);

    }


    static int search( int[] arr , int t , int index)
    {
        if (index == arr.length)
        {
            return -1;
        }
        else
        if (arr[index] == t)
        {
            return index;
        }
        else return search( arr , t , index + 1);

    }



    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex( int[] arr , int t , int index)
    {
        if (index == arr.length)
        {
            return ;
        }
        else
        if (arr[index] == t)
        {
            list.add(index);
        }
        findAllIndex( arr , t , index + 1);


    }



    static ArrayList<Integer> findIndex( int[] arr , int t , int i , ArrayList<Integer> Nlist)
    {
        if( i == arr.length)
        {
            return Nlist;
        }
        if(arr[i] == t)
        {
            Nlist.add(i);
        }
        return findIndex(arr, t , i+1,Nlist);
    }


    static ArrayList<Integer> findIndex1( int[] arr , int t , int i)
    {
        ArrayList<Integer> mlist = new ArrayList<>();
        if( i == arr.length)
        {
            return mlist ;
        }
        if( arr[i] == t)
        {
            mlist.add(i);
        }
        ArrayList<Integer> ansfrombelowcalls = findIndex1(arr,t , i+1);

        mlist.addAll(ansfrombelowcalls);
        return mlist;

    }
}
