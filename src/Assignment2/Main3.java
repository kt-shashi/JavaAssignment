// Assignment 2, Program 3
// 2021pgcaca050

import java.util.*;

public class Main
{	
	public static void main(String[] args) {
	    
	    int x,y;
		Scanner inputHelper=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		x=inputHelper.nextInt();
		y=inputHelper.nextInt();
		
		int g1=gcdRecursion(x,y);
		int g2=gcdIterative(x,y);		
	
	    System.out.println("Gcd using recursion: "+g1);
	    System.out.println("Gcd using iteration: "+g2);
	    
	}
	
	public static int gcdRecursion(int a,int b){
	    return b == 0 ? a : gcdRecursion(b, a % b); 
	}
	
	public static int gcdIterative(int a,int b){
	    
	    int g=1;
	    for(int i=1; i <= a && i <= b; ++i){
            if(a%i==0 && b%i==0)
                g = i;
	    }

        return g;
	}
}
