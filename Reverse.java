package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        Scanner sys = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = sys.nextInt();
        int num  = 0;
        while(n>0)
        {
         int r = n%10;
          n = n/10;
          num = num*10 + r;
        }
        System.out.println(num);
    }
}
