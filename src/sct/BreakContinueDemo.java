package sct;

public class BreakContinueDemo {
	public static void main(String[] args) {
		int [] numbers = {10,23,19,34,54,23,76,39,65,24,8,0,12,55};
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			if (numbers[i]<=0) {
				System.out.println("Break here coz number is invalid: "+numbers[i]);
				break;
			}else if (numbers[i]%2 != 0) {
				System.out.println("Continue here coz number is odd: "+numbers[i]);
				continue;
			}
			sum += numbers[i];
			//System.out.println("Iteration No: "+i);
		}
		System.out.println("Sum: "+sum);
	}
}
