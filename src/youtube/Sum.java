package youtube;

import java.util.*;

public class Sum {

	public static void main(String [] args) {
		int z = 1; 
	Scanner input = new Scanner(System.in); 
	do {
	try {
	System.out.println("Please enter a number: "); 
	int x= input.nextInt();
	
	System.out.println("Please enter a number: "); 
	int y = input.nextInt();
	
	int sum = (x/y);
	System.out.println(sum);
	//z=2;
	}
	catch (Exception e){
		System.out.println("Your input is not valid.");
	}

	}
	while(z==1);
	}
	}