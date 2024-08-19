package milestone1;

import java.util.Scanner;

public class CF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		if (x < 0) 
			System.out.println("Negative");
		else if (x == 0) 
			System.out.println("Zero");
		else 
			System.out.println("Positive");
		main(args);
		sc.close();

	}

}
