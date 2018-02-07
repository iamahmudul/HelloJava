package sct;


public class WrapperCheck {
	public static void main(String[] args) {
		Integer k = new Integer("22");
		System.out.println(k);
		String kk  = "25";
		Integer kkk = Integer.parseInt(kk);
		System.out.println();
		System.err.println(kkk);
		Integer lInteger = new Integer(kk);
		System.out.println(lInteger.doubleValue());
		System.out.println(kkk.doubleValue());
		System.out.println("======================");
		Integer intObj1 = new Integer(23);
		Integer intObj2 = new Integer("32");
		Integer intObj3 = new Integer(41);
		Integer intObj4 = new Integer("23");
		
		//Compare to demo
		System.out.println("obj1 > obj2: "+intObj1.compareTo(intObj2));
		System.out.println("obj1 = obj4: "+intObj4.compareTo(intObj1));
		System.out.println("obj2 < obj3: "+intObj2.compareTo(intObj4));
		
		//Equals demo
		System.out.println("obj 1 and obj 2: "+intObj1.equals(intObj2));
		System.out.println("obj 3 and obj 4: "+intObj3.equals(intObj4));
		System.out.println("obj 4 and obj 1: "+intObj4.equals(intObj1));
		
		//Float compare
		Float f1 = new Float(23.2f);
		Float f2 = new Float(32.4f);
		Float f3 = new Float(12.8f);
		System.out.println("Compare f1 and f2: "+Float.compare(f1, f2));
		
		Float float1 = intObj1.floatValue() + f1;

		System.out.println(float1);
		
		
	}
}
