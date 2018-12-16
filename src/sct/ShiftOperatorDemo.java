package sct;

public class ShiftOperatorDemo {

	public static void main(String[] args) {
		int a = 6;
		int b = -10;
		
		System.out.println("Signed right shift of a : "+ (a>>1));
		System.out.println("Signed right shift of b : "+ (b>>1));
		System.out.println("Signed right shift of a : "+ (a<<2));
		System.out.println("Signed right shift of b : "+ (b<<1));
		System.out.println("Unsigned right shift of a : "+ (a>>>1));
		System.out.println("Unsigned right shift of a : "+ (b>>>1));
	}

}
