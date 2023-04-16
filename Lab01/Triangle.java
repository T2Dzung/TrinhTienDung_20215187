package Lab01;

import java.util.Scanner;

public class Triangle {
//	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);    
//	    System.out.println("enter n:");    
//	    int n = keyboard.nextInt();   
//	    int i,j,k;  
//	    for(i=1;i<=n;i++){    
//	        for(j=1;j<=2*(n-i);j++){    
//	        	System.out.print(" ");    
//	        }    
//	        for(k=1;k<=(2*i-1);k++){    
//	        	System.out.print("* ");    
//	        }    
//	        System.out.println();    
//	    }    
//	}
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input height of n stars = ");
		int n = keyboard.nextInt();
		
		for (int i = n; i > 0; i--) {
			for(int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			int stars = (n - i) * 2 + 1;
			for(int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		keyboard.close();
	}
}
