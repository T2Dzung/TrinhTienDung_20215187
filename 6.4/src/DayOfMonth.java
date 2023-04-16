import java.util.Scanner;

public class DayOfMonth {
	private static String[]  month31Days = {"january", "jan", "jan.", "1", "march", "mar", "mar.", "3", "may", "5", "july", "jul", "7", "august", "aug.", "aug", "8", "octobe","oct.", "oct", "10", "december", "dec.", "dec", "12"};
	private static String[] month30Days = {"april", "apr.", "apr", "4", "june", "jun", "6", "september", "sept.", "sept", "9", "november", "nov.", "nov", "11"};
	private static String[] month2829Days = {"february", "feb", "feb.", "2"};
	private static boolean isValid = false;
	
	public static boolean isLeapYear(int year) {
		if(year%400==0) return true;
		else {
			if(year%4==0) {
				if(year%100==0) return false;
				else return true;
			}else return false;
		}
	}
	
	public static void noOfDay(String month, int year) {
		for(String tmp:month31Days) {
			if(tmp.equals(month)) {
				isValid = true;
				System.out.println("There are 31 days");
			}
		}
		for(String tmp:month30Days) {
			if(tmp.equals(month)) {
				isValid = true;
				System.out.println("There are 30 days");
			}
		}
		for(String tmp:month2829Days) {
			if(tmp.equals(month)) {
				isValid = true;
				if(isLeapYear(year)) System.out.println("There are 29 days");
				else System.out.println("There are 28 days");
			}
		}
		if(!isValid) System.out.println("Invalid month. Please enter again!");
	}
	
	public static void main(String[] args) {
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter month: ");
			String month = keyboard.nextLine().toLowerCase();
			System.out.println("Enter year: ");
			int year = keyboard.nextInt();
			
			if(year<0) System.out.println("Invalid year. Please enter again!");
			else noOfDay(month, year);
		}
	}
}
