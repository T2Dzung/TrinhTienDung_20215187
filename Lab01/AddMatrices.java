package Lab01;

import java.util.Scanner;

public class AddMatrices {
	public static void printMat(int[][] mat, int r, int c) {
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] arg) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of row: ");
		int r = keyboard.nextInt();
		System.out.println("Enter number of column: ");
		int c = keyboard.nextInt();
		
		int[][] mat1 = new int[r][c];
		int[][] mat2 = new int[r][c];
		int[][] sum = new int[r][c];
		
		System.out.println("Enter the first matrix: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.printf("Enter [%d][%d] element\n", i+1, j+1);
				mat1[i][j] = keyboard.nextInt();
			}
		}
		System.out.println("The first matrix: ");
		printMat(mat1, r, c);
		
		System.out.println("Enter the second matrix: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.printf("Enter [%d][%d] element\n", i+1, j+1);
				mat2[i][j] = keyboard.nextInt();
			}
		}
		System.out.println("The second matrix: ");
		printMat(mat2, r, c);
		
		System.out.println(">>>>>Sum: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		printMat(sum, r, c);
	}
}
