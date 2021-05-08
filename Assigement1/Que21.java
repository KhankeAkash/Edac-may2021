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
        binary[index++]=n%8;
         n=n/8;
     }
    
     for(int i=index-1;i>=0;i--)
     {
          System.out.print(binary[i]);
     }
  
    }

 }
