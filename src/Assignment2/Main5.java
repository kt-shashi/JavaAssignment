package Assignment2;// Assignment 2, Program 5
// 2021pgcaca050

import java.util.*;

public class Main5
{
  public static void main (String[]args)
  {

    int size;
    Scanner inputHelper = new Scanner (System.in);

      System.out.println ("Enter size of array: ");
      size = inputHelper.nextInt ();

      System.out.println ("Enter elements of array: ");
    int[] a = new int[size];

    for (int i = 0; i < size; i++)
        a[i] = inputHelper.nextInt ();

    for(int i=0;i<size;i++){
        int count=1;
        
        if(a[i]==-1)
            continue;
            
        for(int j=i+1;j<size;j++)
            if(a[j]==a[i]){
                a[j]=-1;
                count++;
            }
        
        System.out.println("Freq of "+a[i]+" = "+count);
    }

  }
}
