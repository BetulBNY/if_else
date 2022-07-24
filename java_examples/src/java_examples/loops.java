package java_examples;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
		
		//EX1  make table 1 to 100 add around frame	
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

		
		
		//while version
		int i=0, j=1;	
		while(i<10) {
			
			while(j<11)
			{
				
				System.out.printf("%d\t",j+i*10);
				j++;
			}
			System.out.println(" ");
			i++;
			j=1;
		}
			
		//ex6 calculate the sum of the input numbs until the user enters  zero.
			
		System.out.println("please enter number");
		Scanner get=new Scanner(System.in);
		int numb;
		int sum=0;
		do {
			 numb=get.nextInt();
			 sum+=numb;
			
		}while(numb!=0);     //numb==0 yaptigin zaman devam etmez cunku burda 0' a esit olmadigi surece devam etsin diyor.
		System.out.println(sum);
		
		
		
		
		
		
	}

}
