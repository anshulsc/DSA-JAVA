package com.company.subsets;

public class Permutations
{
    public static void main(String[] args) {
        perm("","abc");
    }
    static void perm(String p , String s)
    {
        if(s.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char c = s.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0,i);
            String g = p.substring(i,p.length());
            perm(f + c + g , s.substring(1));

        }
    }
}
