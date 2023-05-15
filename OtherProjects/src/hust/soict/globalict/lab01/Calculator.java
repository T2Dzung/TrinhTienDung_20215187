package hust.soict.globalict.lab01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculator {
	public static void sum(double a, double b) {
		 String output = "Sum: "+String.format("%.2f", a + b);
		 JOptionPane.showMessageDialog(null, output, "Sum", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void minus(double a, double b) {
		String output = "Difference: "+String.format("%.2f", a-b);
		JOptionPane.showMessageDialog(null, output, "Difference", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void multiply(double a, double b) {
		String output = "Product: "+String.format("%.2f", a*b);
		JOptionPane.showMessageDialog(null, output, "Product", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void divide(double a, double b) {
		String output = "";
		if(b==0) output += "Second number must not equal 0!"; 
		else output += "Quotient: "+String.format("%.2f", a/b);
		JOptionPane.showMessageDialog(null, output, "Quotient", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		String[] options = {"Sum", "Difference", "Product", "Quotient"};
	    int sel = JOptionPane.showOptionDialog(null, "Select an operation:", "Calculator", 
	                                                      0, 3, null, options, options[0]);
	    String str1, str2;
	    str1 = JOptionPane.showInputDialog(null,"Enter the first number: ","First number",JOptionPane.INFORMATION_MESSAGE);
	    str2 = JOptionPane.showInputDialog(null,"Enter the second double: ","Second number",JOptionPane.INFORMATION_MESSAGE);

	    double a = Double.parseDouble(str1);
	    double b = Double.parseDouble(str2);
	    if (sel == 0) {
	    	sum(a,b);
	    }
	    if (sel == 1) { 
	    	minus(a,b);
	    }
	    if (sel == 2) { 
	    	multiply(a,b);
	    }
	    if (sel == 3) { 
	    	divide(a,b);
	    }
	}
}
