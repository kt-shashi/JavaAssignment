// Assignment 2, Program 1
// 2021pgcaca050

import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    
		int x1,x2,y1,y2,x3,x4,y3,y4;
		Scanner inputHelper=new Scanner(System.in);
		
		System.out.println("Enter the coordinates of first line");
		System.out.print("x1 : ");
		x1=inputHelper.nextInt();
		System.out.print("x2 : ");
		x2=inputHelper.nextInt();
		System.out.print("y1 : ");
		y1=inputHelper.nextInt();
		System.out.print("y2 : ");
		y2=inputHelper.nextInt();
		
		System.out.println("Enter the coordinates of second line");
		System.out.print("x3 : ");
		x3=inputHelper.nextInt();
		System.out.print("x4 : ");
		x4=inputHelper.nextInt();
		System.out.print("y3 : ");
		y3=inputHelper.nextInt();
		System.out.print("y4 : ");
		y4=inputHelper.nextInt();
		
		int s1=Math.abs((y2-y1)/(x2-x1));
		int s2=Math.abs((y4-y3)/(x4-x3));
		
		// Find slope 
		if(s1==s2)
		    System.out.println("Lines are not intersecting");
		else
		    System.out.println("Lines are intersecting");

	}
}