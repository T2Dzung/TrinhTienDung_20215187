package Lab01;

import javax.swing.JOptionPane;

public class Equations2 {
	public static void firstDegreeEq() {
		String str1, str2;
	    str1 = JOptionPane.showInputDialog(null,"Enter a: ","ax + b = 0",JOptionPane.INFORMATION_MESSAGE);
	    str2 = JOptionPane.showInputDialog(null,"Enter b: ",str1+"x + b = 0",JOptionPane.INFORMATION_MESSAGE);
	    double a = Double.parseDouble(str1);
	    double b = Double.parseDouble(str2);
	    String output = "";
		if(a==0) {
			if(b==0) output += "Infinite solutions.";
			else output += "No solution.";
		}
		else output += ("x = "+String.format("%.2f", -b/a));
		JOptionPane.showMessageDialog(null, output, str1+"x + "+str2+" = 0", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void systemFirstDegreeEq() {
		String str1, str2, str3, str4, str5, str6;
	    str1 = JOptionPane.showInputDialog(null,"Enter a1: ","a1x1 + a2x2 = b1; a3x1 + a4x2 = b2",JOptionPane.INFORMATION_MESSAGE);
	    str2 = JOptionPane.showInputDialog(null,"Enter a2: ",str1+"x1 + a2x2 = b1; a3x1 + a4x2 = b2",JOptionPane.INFORMATION_MESSAGE);
	    str3 = JOptionPane.showInputDialog(null,"Enter a3: ",str1+"x1 + "+str2+"x2 = b1; a3x1 + a4x2 = b2",JOptionPane.INFORMATION_MESSAGE);
	    str4 = JOptionPane.showInputDialog(null,"Enter a4: ",str1+"x1 + "+str2+"x2 = b1; "+str3+"x1 + a4x2 = b2",JOptionPane.INFORMATION_MESSAGE);
	    str5 = JOptionPane.showInputDialog(null,"Enter b1: ",str1+"x1 + "+str2+"x2 = b1; "+str3+"x1 + "+str4+"x2 = b2",JOptionPane.INFORMATION_MESSAGE);
	    str6 = JOptionPane.showInputDialog(null,"Enter b2: ",str1+"x1 + "+str2+"x2 = "+str5+"; "+str3+"x1 + "+str4+"x2 = b2",JOptionPane.INFORMATION_MESSAGE);
	    double a1 = Double.parseDouble(str1);
	    double a2 = Double.parseDouble(str2);
	    double a3 = Double.parseDouble(str3);
	    double a4 = Double.parseDouble(str4);
	    double b1 = Double.parseDouble(str5);
	    double b2 = Double.parseDouble(str6);
	    String output = "";
		double D = a1*a4-a3*a2, D1 = b1*a4-b2*a2, D2 = b2*a1-b1*a3;
		if(D!=0) {
			output+=("x1 = "+String.format("%.2f", D1/D));
			output+=("; x2 = "+String.format("%.2f", D2/D));
		}else {
			if(D1!=0 || D2!=0) output+="No solution.";
			else output+="Infinite solutions.";
		}
		JOptionPane.showMessageDialog(null, output, str1+"x1 + "+str2+"x2 = "+str5+"; "+str3+"x1 + "+str4+"x2 = "+str6, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void  secondDegreeEq() {
		String str1, str2, str3;
	    str1 = JOptionPane.showInputDialog(null,"Enter a: ","ax^2 + bx + c = 0",JOptionPane.INFORMATION_MESSAGE);
	    str2 = JOptionPane.showInputDialog(null,"Enter b: ",str1+"x^2 + bx + c = 0",JOptionPane.INFORMATION_MESSAGE);
	    str3 = JOptionPane.showInputDialog(null,"Enter c: ",str1+"x^2 + "+str2+"x + c = 0",JOptionPane.INFORMATION_MESSAGE);
	    double a = Double.parseDouble(str1);
	    double b = Double.parseDouble(str2);
	    double c = Double.parseDouble(str3);
	    String output = "";
		if(a==0) output+="a must not equal 0.";
		else {
			double delta = b*b - 4*a*c;
			if(delta < 0) output+="No real solution.";
			else if(delta == 0) output+=("x1 = x2 = "+String.format("%.2f", -b/(2*a)));
			else output+=("x1 = "+String.format("%.2f", (-b+Math.sqrt(delta))/(2*a))+"; x2 = "+String.format("%.2f", (-b-Math.sqrt(delta))/(2*a)));
		}
		JOptionPane.showMessageDialog(null, output, str1+"x^2 + "+str2+"x + "+str3+" = 0", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		String[] options = {"First-degree equation", "System of first-degree equations", "Second-degree equation"};
	    int n = JOptionPane.showOptionDialog(null, "Select type of equation:", "Equation Solver", 
	                                                      0, 3, null, options, options[0]);
	    if(n==0) {
			firstDegreeEq();
	    }else if(n==1){
			systemFirstDegreeEq();
	    }else if(n==2) {
			secondDegreeEq();
	    }
	}
}
