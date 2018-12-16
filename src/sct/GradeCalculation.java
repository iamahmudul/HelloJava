package sct;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		int marks = 0;
		try {
			Scanner inputDevice = new Scanner(System.in);
			System.out.println("Enter your marks you in the exam? ");
			marks = inputDevice.nextInt();
			if (marks < 0) {
				System.out.println("You can not enter negative marks.");
			}else if (marks == 0) {
				System.out.println("You got ZERO. Go to the ZOO you dumbass.");
			}else if (marks > 100) {
				System.out.println("You can not enter beyond 100 marks.");
			}else if (marks > 0 && marks < 35) {
				System.out.println("You need to work hard. You failed this time with marks: " + marks);
			}else if (marks >= 35 && marks < 50) {
				System.out.println("Not bad. But you need to improve. Your got C Grade.");
			}else if (marks >= 50 && marks < 60) {
				System.out.println("You got C+ Grade.");
			}else if (marks >= 60 && marks < 70) {
				System.out.println("You got B Grade.");
			}else if (marks >= 70 && marks < 80) {
				System.out.println("You got B+ Grade.");
			}else if (marks >= 80 && marks < 90) {
				System.out.println("You got A Grade.");
			}else {
				System.out.println("You got A+ Grade.");
			}
		} catch (Exception e) {
			System.err.println("Invalid entry for marks: "+e);
		}
	}
}
