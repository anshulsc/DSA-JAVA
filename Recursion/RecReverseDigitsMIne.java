package com.company.Recursion;

public class RecReverseDigitsMIne {
    public static void main(String[] args) {

        System.out.println(palin(78687));
    }

    //This is mine
    static int rev(int a)
    {
        if(a%10 == a)
        {
            return a;
        }
        int n = a;
        int c = 0;
//        while( n > 0)
//        {
//            n = n/10;
//            c++;
//        }
          c = (int)(Math.log10(a))+ 1;   // This thing is equivalent to above while  loop

        return (int) (((a%10) * Math.pow(10,c-1) )+ rev(a/10));
    }
    static boolean palin(int n)
    {
        return n == rev(n);
    }
}
