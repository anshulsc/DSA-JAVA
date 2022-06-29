package com.company;

public class FindNoofDigitsbinary {
    public static void main(String[] args) {
        int n = 10 ;
        int base = 2;
        System.out.println(ans(n , base));
    }
    static int ans(int n , int b){
        return (int)( Math.log(n)/Math.log(b)) + 1 ;
    }
}
