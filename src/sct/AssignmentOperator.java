package sct;

public class AssignmentOperator {
	public static void main(String[] args) {
		long a = 555;
		int b = 22;
		short c = 44;
		byte d = 91;
		
		//byte  x = a;	//Compile time error :: assigning higher precision primitive to lower
		int w = d;		//No error :: lower precision primitive to higher
		
		
		byte q = (byte) 130;	//byte have 8-bit storage space and range -128 to 127
		System.out.println("Value of s : "+q);
		System.out.println("=======================================");
		String s = new String("Mahedi");	//reference variable assignment
		ArrayHelper g = new ArrayHelper();
		TwoDimArra twoDimArra = null;
		
		
		b %=4; // is equivalent to b = b%4;
		System.out.println("b after %4 : "+b);
	}
}
