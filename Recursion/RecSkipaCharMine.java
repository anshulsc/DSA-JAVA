package com.company.Recursion;

public class RecSkipaCharMine
{
    public static void main(String[] args)
    {
        String str = "aanshulanshjul";
         char skip = 'a';
         StringBuilder aq = skipachar( str,skip);
         System.out.print(aq);

    }
    static StringBuilder skipachar( String s , char a)
    {
         StringBuilder ans = new StringBuilder();
         helper( ans , s ,a);
         return ans;
    }
    static void helper( StringBuilder aa , String s , char a )
    {
        if( s.length() == 0) // s.isEmpty()
        {
            return;
        }
        if( s.charAt(0) == a )
        {
            helper(aa,s.substring(1) , a);
        }
        else
        {
            aa.append(s.charAt(0));
            helper(aa,s.substring(1),a);
        }
    }

}
