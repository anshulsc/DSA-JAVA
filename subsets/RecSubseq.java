package com.company.subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class  RecSubseq
{
    public static void main(String[] args)
    {
        String p ="";

       System.out.println( subseqlist(p , "abc"));
    }
    static void subseq( String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subseq(p+c,up.substring(1));
        subseq( p , up.substring(1));
    }
    static ArrayList<String> subseqlist(String p , String up)
    {
        if(up.isEmpty())
        {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char c = up.charAt(0);
        ArrayList<String> right = subseqlist(p+c,up.substring(1));
        ArrayList<String> left = subseqlist(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
