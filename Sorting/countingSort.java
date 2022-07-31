package com.company.Sorting;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;

public class countingSort {

    public static void main(String[] args) {

        int arr[] = {3,3,6,7,5,5,3,2,3,5,9,8,8};

        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] countSort(int[] arr) {

        ArrayList<ArrayList> list = new ArrayList<>();

        for(int i = 0 ; i<=9 ; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0 ; i < arr.length ; i++){
            list.get(arr[i]).add(arr[i]);
        }

        ArrayList<Integer> sol = new ArrayList<>();

        for(int i = 0 ; i<list.size() ; i++){
            sol.addAll(list.get(i));
        }
        for(int i = 0 ; i< arr.length; i++){
            arr[i] = sol.get(i);
        }

        return arr;
    }
}
