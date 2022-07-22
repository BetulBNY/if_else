package java_examples;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
		
		//EX1  make table 1 to 100 around frame	
		for(int k=0;k<27;k++)
			System.out.printf("  *");
		System.out.println(" ");					
			
		for(int i=0;i<10;i++)
			{			
			System.out.printf("* ");		
				
			for(int j=1;j<11;j++)				
				System.out.printf("%d\t ",j+i*10);				
			System.out.println("*");		
			}
		
		for(int k=0;k<27;k++)
			System.out.printf("  *");

	}

}
