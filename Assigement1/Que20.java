//import java.util.Scanner;

public class Que21
{


   public static void main(String args[])
   {
     int binary[]=new int[20];
     int index=0;
     int n=15;
     while(n>0)
     {
        binary[index++]=n%16;
         n=n/16;
     }
    
     for(int i=index-1;i>=0;i--)
     {
          System.out.print(binary[i]);
     }
  
    }

 }
