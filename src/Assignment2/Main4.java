// Assignment 2, Program 4
// 2021pgcaca050

import java.util.*;

public class Main
{
  public static void main (String[]args)
  {

    int size;
    Scanner inputHelper = new Scanner (System.in);

      System.out.println ("Enter size of array: ");
      size = inputHelper.nextInt ();

      System.out.println ("Enter elements of first array: ");
    int[] a1 = new int[size];

    for (int i = 0; i < size; i++)
        a1[i] = inputHelper.nextInt ();

      System.out.println ("Enter elements of second array: ");
    int[] a2 = new int[size];
    for (int i = 0; i < size; i++)
        a2[i] = inputHelper.nextInt ();

    // Find dot product using for each
    int d[] = new int[size];
    for (int i = 0; i < size; i++)
        d[i] = 1;

    int j=0;
    for (int i:a1)
        d[j++] *= i;
        
    j=0;
    for (int i:a2)
        d[j++] *= i;
    
    int sum=0;
    for(int i:d)
        sum+=i;

    System.out.println("Sum: "+sum);
  }
}
