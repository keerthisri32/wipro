package milestone1;

import java.util.Scanner;

public class CF4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String gender = scn.next();
		int age = scn.nextInt();
		if (!gender.equals("Male") && !gender.equals("Female"))
			System.out.println("Invalid gender");
		if (age < 1 || age >= 120)
			System.out.println("Invalid age");
		if (gender.equals("Female") && (age >= 1 && age <= 58)) 
		{
			System.out.println("Interest == 8.2%");
		}
	else if (gender.equals("Female") && (age >= 59 && age <= 120)) 
	{
		System.out.println("Interest == 7.6%");
		} 
	else if (gender.equals("Male") && (age >= 1 && age <= 60)) 
	{
		System.out.println("Interest == 9.2%");
		} 
	else if (gender.equals("Male") && (age >= 61 && age <= 120)) 
	{
		System.out.println("Interest == 8.3%");
	}
	}

}
