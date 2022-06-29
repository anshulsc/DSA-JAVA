package com.company.subsets;

import java.util.ArrayList;

public class PermutationList
{
    public static void main(String[] args) {

        System.out.println(permList("","abc"));
    }
    static ArrayList<String> permList(String p , String s)
    {
        if(s.isEmpty())
        {
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char c = s.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0,i);
            String g = p.substring(i,p.length());
            ans.addAll(permList(f + c + g , s.substring(1)));

        }
        return ans;
    }
}
