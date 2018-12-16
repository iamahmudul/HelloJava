package sct;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char grade = in.nextLine().charAt(0);
		switch (grade) {
		case 'A':
			System.out.println("You are a Grade A Employee. Bonus: "+ 2000);
			break;
		case 'B':
			System.out.println("You are a Grade B Employee. Bonus: "+ 1000);
			break;
		case 'C':
			System.out.println("You are a Grade C Employee. Bonus: "+ 500);
		default:
			System.out.println("You are a Gradeless Employee. Bonus: "+ 50);
			in.close();
			break;
		}
	}

}
