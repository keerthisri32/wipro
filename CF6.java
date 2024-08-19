package milestone1;

import java.time.Month;
import java.util.Scanner;

public class CF6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		if (args.length == 0)
		{
			System.out.println("Please enter the month in numbers");
			}
		int month =scn.nextInt();
		if (month < 1 || month > 12)
		{
			System.out.println("Invalid month");
		System.exit(0);
	}
	String monthStr = Month.of(month).name();
	monthStr = monthStr.substring(0,1).toUpperCase() + monthStr.substring(1).toLowerCase();
	System.out.println(monthStr);
	}

}
