package Assignment2;// Assignment 2, Program 6
// 2021pgcaca050

import java.util.Scanner;
public class Main6
{
    
	public static void main(String[] args) {
	    
	    Scanner inputHelper=new Scanner(System.in);
	    double a,r,n;
	    
        System.out.print("Enter first element: ");
	    a=inputHelper.nextFloat();
        System.out.print("Enter common ratio: ");
	    r=inputHelper.nextFloat();
        System.out.print("Enter no of terms: ");
	    n=inputHelper.nextFloat();
	    
	    double rn=1;
	    
        System.out.println("Geometric Progression upto n terms :- ");
        for(int i=1;i<=n;i++)
        {
            double t=a*rn;
            System.out.print(t + " ");
            rn*=r;
        }
	}
	
}