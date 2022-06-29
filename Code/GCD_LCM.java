package com.company;

public class GCD_LCM {
    public static void main(String[] args) {

        System.out.print(lcm(2,7));
    }
    // GCD is like HCF
    static int gcd(int a , int b)
    {
        if(a == 0)
        {
            return b;
        } 
        return gcd( b%a , a);
    }
    static int lcm( int a , int b)
    {
        return (a*b)/gcd(a,b);
    }

}
