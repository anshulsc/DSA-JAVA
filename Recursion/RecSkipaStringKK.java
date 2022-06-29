package com.company.Recursion;

public class RecSkipaStringKK
{
    public static void main(String[] args)
    {
        String s = "baccappled";
        System.out.println(skipApple(s));
        String p ="bappnotapple";
        System.out.println(skipAppnotApple(p));

    }
    static String skipApple( String zl)
    {
        if(zl.isEmpty())
        {
            return "" ;
        }
        char ch = zl.charAt(0);
        if( zl.startsWith("apple"))
        {
            return skipApple(zl.substring(5));
        }
        else
        {
            return ch + skipApple(zl.substring(1));
        }

    }
    static String skipAppnotApple( String up)
    {
        if(up.isEmpty())
        {
            return "" ;
        }
        char ch = up.charAt(0);
        if( up.startsWith("app") && !(up.startsWith("apple")))
        {
                return skipAppnotApple(up.substring(3));
        }
        else
        {
                return ch + skipAppnotApple(up.substring(1));
        }

    }

    }


