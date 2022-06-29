package com.company.Recursion;

public class RecSkipaCharkk
{
    public static void main(String[] args)
    {
        String s = "baccad";
        skipachar("",s);

    }
    static void skipachar(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
         char ch = up.charAt(0);
        if( ch == 'a')
        {
            skipachar(p , up.substring(1));
        }
        else
        {
            skipachar(p+ch,up.substring(1));
        }

    }
}
