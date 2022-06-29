package com.company;

import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args) {

   for(int i = 100 ; i < 1000 ; i++)
   {
       if(isangram(i))
       {
           System.out.println(" " + i);
       }
   }
    }

    static boolean isangram(int n)
    {
        int num = n;
        int sum = 0;
        while(n>0)
        {
            int a = n%10;
            sum = sum + a*a*a;
            n = n/10;
        }
        if(sum == num)
        {
            return true;
        }
        else return false;
    }
}

