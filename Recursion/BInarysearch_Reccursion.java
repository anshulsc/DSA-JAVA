package com.company.Recursion;

public class BInarysearch_Reccursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.print(search(arr , target , 0 , arr.length -1));
    }
    static int search(int[] arr , int t , int s, int e){

        int m = s +(e-s)/2;
        if(arr[m] == t){
            return m;
        }
        if(arr[m]< t){
            return search(arr , t , m+1 ,e);
        }
        if(arr[m] > t){
            return search(arr , t ,s,m-1);
        }
        return -1;
    }
}
