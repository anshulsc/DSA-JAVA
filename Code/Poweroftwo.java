package com.company;

public class  Poweroftwo {
    public static void main(String[] args) {
        int n = 15;
        boolean ans = (n & n-1) == 0;
        System.out.print(ans);
    }
}
