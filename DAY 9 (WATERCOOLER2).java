import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codeshef
{
   public static void main (String[] args) throws java.lang.Exception
   {
       Scanner sc = new Scanner(System.in);
       int t =sc.nextInt();
       while(t-->0){
           int x=sc.nextInt();
           int y=sc.nextInt();
           if(y%x==0)
           System.out.println((y/x)-1);
           else
           System.out.println(y/x);
       }
   }
}


