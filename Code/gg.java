package com.company;

public class gg
{
    public static void main(String[] args) {
        System.out.println(sum(1234,0));
    }
     public static int sum(int n , int suum)
     {
         if(n<=0)
         {
             return suum ;
         }
         int a= n%10;
         suum = suum + a;
         return  sum(n/10,suum);


     }
}
