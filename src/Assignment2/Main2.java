package Assignment2;// Assignment 2, Program 2
// 2021pgcaca050

import java.util.*;
import java.lang.Math;
public class Main2
{
	public static void main(String[] args) {
	    
		Scanner inputHelper=new Scanner(System.in);
		
		int r, c1,c2,a1,a2;
		System.out.println("Enter radius: ");
		r=inputHelper.nextInt();
		System.out.println("Enter Assignment6.coordinates of circle: ");
		System.out.print("C1: ");
		c1=inputHelper.nextInt();
		System.out.print("C2: ");
		c2=inputHelper.nextInt();
		System.out.println("Enter arbitary point: ");
		System.out.print("A1: ");
		a1=inputHelper.nextInt();
		System.out.print("A2: ");
		a2=inputHelper.nextInt();
		
		double dis=Math.sqrt((c1-a1)*(c1-a1)+(c2-a2)*(c2-a2));
		if(dis < r)
		    System.out.println("Point is inside circle");
		else if( dis > r )
		    System.out.println("Point is outside circle");
		else
		    System.out.println("Point is on circle");
	}
}