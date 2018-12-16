package sct;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		for(;i>0;i--) {
			if (i%7 == 0) {
				System.out.print(i+", ");
			}
		}
		
		int k[]  = new int[10];
		for(int a=100;a>0;a-=10,i++) {
			k[i] = a;
		}
		
		for(int loopVal:k) {
			System.out.println("Loop variable : " + loopVal);
		}

	}

}
