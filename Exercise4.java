package com.i;

import java.util.function.Function;


public  class Exercise4 
{
    public static void main(String[] args)
{
        Exercise4  fs=new Exercise4 ();
         Function<Integer,Long>f=fs::fact;

         long res=f.apply(6);
         System.out.println(res);

}
    public  long fact(int x)
    {
     long factres=1;
     for(int i=1;i<=x;i++)
     {
         factres=factres*i;
     }
     return factres;
}
}