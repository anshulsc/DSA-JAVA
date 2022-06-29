package com.company.subsets;

public class PermutationCount
{
    public static void main(String[] args) {

        int n = permCount("","abc");
        System.out.println(n);
    }
    static int permCount(String p , String s)
    {
        if(s.isEmpty())
        {

            return 1;
        }
        int count = 0;

        char c = s.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0,i);
            String g = p.substring(i,p.length());
            count = count +  permCount(f + c + g , s.substring(1));

        }
        return count;
    }
}
