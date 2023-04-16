package Lab01;

import java.util.Scanner;

public class Equations {
	public static void firstDegreeEq(double a, double b) {
		if(a==0) System.out.println("a must not equal 0");
		else System.out.printf("x = %.2f\n",  -b/a);
	}
	
	public static void systemFirstDegreeEq(double a1, double a2, double a3, double a4, double b1, double b2) {
		double D = a1*a4-a3*a2, D1 = b1*a4-b2*a2, D2 = b2*a1-b1*a3;
		if(D!=0) {
			System.out.printf("x1 = %.2f\n", D1/D);
			System.out.printf("x2 = %.2f\n", D2/D);
		}else {
			if(D1!=0 || D2!=0) System.out.println("No solution.");
			else System.out.println("Infinite solutions.");
		}
	}
	
	public static void  secondDegreeEq(double a, double b, double c) {
		if(a==0) System.out.println("a must not equal 0.");
		else {
			double delta = b*b - 4*a*c;
			if(delta < 0) System.out.println("No real solution.");
			else if(delta == 0) System.out.printf("x1 = x2 = %.2f\n", -b/(2*a));
			else System.out.printf("x1 = %.2f; x2 = %.2f", (-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a));
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			Scanner keyboard = new Scanner(System.in);   
			System.out.println("***Equations: ");
		    System.out.println("1. ax + b = 0");
		    System.out.println("2. a1x1 + a2x2 = b1; a3x1 + a4x2 = b2");
		    System.out.println("3. ax^2 + bx + c = 0");
		    System.out.println("4. End");
		    System.out.println("***Your selection: ");
		    int n = keyboard.nextInt();  
		    if(n==1) {
		    	System.out.println("Enter a: ");
				double a = keyboard.nextDouble();
				System.out.println("Enter b: ");
				double b = keyboard.nextDouble();
				firstDegreeEq(a, b);
		    }else if(n==2){
		    	System.out.println("Enter a1: ");
				double a1 = keyboard.nextDouble();
				System.out.println("Enter a2: ");
				double a2 = keyboard.nextDouble();
				System.out.println("Enter a3: ");
				double a3 = keyboard.nextDouble();
				System.out.println("Enter a4: ");
				double a4 = keyboard.nextDouble();
				System.out.println("Enter b1: ");
				double b1 = keyboard.nextDouble();
				System.out.println("Enter b2: ");
				double b2 = keyboard.nextDouble();
				systemFirstDegreeEq(a1,a2,a3,a4,b1,b2);
		    }else if(n==3) {
		    	System.out.println("Enter a: ");
				double a = keyboard.nextDouble();
				System.out.println("Enter b: ");
				double b = keyboard.nextDouble();
				System.out.println("Enter c: ");
				double c = keyboard.nextDouble();
				secondDegreeEq(a,b, c);
		    }else if(n==4) {
		    	System.out.println("Bye");
		    	break;
		    }
		  
		}
	}
}
