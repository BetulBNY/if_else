package java_examples;
import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		
	//EXAMPLE 1: Entered character is digit, special or alphabet?
		
	Scanner get=  new Scanner(System.in);
	char cont;
	do {
		System.out.println("please enter a character");
		char c=get.next().charAt(0);
		if(c<='z' && c>='a' || c<='Z' && c>='A' )
		System.out.println("it is alphabet");
			
		else if(c>='1' && c<='9')
		System.out.println("it is digit");
	
		else
		System.out.println("special");
	
		System.out.println("Do you want to continue? (y/n)");
		cont=get.next().charAt(0);
		}while(cont=='y' || cont=='Y');

	
	/////////////////////////////////////////////////////
	//EXAMPLE 2: Extract numbers from string.
	System.out.println("Please enter a string:");
   // Scanner get= new Scanner(System.in);
    String str=get.next();
    for(int i=0;i<str.length();i++)
    {
    	if(str.charAt(i)>='0' && str.charAt(i)<='9')
    		System.out.print(str.charAt(i));
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	
	
}
