package sct;

public class ReturnDemo {

	public static void main(String[] args) {
		for (int i = 24; i < 35; i++) {
			new ReturnDemo().checkEven(i);
		}

	}
	public boolean checkEven(int k) {
		if (k%2 == 0) {
			System.out.println(k+" is an even number");
			return true;
		}
		System.out.println(k+" is an odd number");
		return false;
	}

}
