import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);    
	    System.out.println("enter n:");    
	    int n = keyboard.nextInt();   
	    int i,j,k;  
	    for(i=1;i<=n;i++){    
	        for(j=1;j<=(n-i);j++){    
	        	System.out.print(" ");    
	        }    
	        for(k=1;k<=(2*i-1);k++){    
	        	System.out.print("*");    
	        }    
	        System.out.println();    
	    }    
	}
}
