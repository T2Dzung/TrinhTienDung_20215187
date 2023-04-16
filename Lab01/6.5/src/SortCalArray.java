import java.util.Arrays;
import java.util.Scanner;

public class SortCalArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = keyboard.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.printf("Enter %d element: \n", i+1);;
			arr[i] = keyboard.nextInt();
		}
		
		Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        int sum=0;
        for(int i=0; i<n; i++) {
        	sum+=arr[i];
        }
        System.out.println("Sum of the array: " + sum);
        System.out.printf("Average value of the array: %.2f\n", (double)sum/(double)n);
	}
}
