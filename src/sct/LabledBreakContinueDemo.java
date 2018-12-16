package sct;

public class LabledBreakContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j+"\t");
				if (i==j) {
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------------");
		int breakLimit = 9;
		outer: for (int i = 0; ; i++) {
			for (int j = 0; j < 10; j++) {
				if (j>i) {
					System.out.println();
					continue outer;
				}
				System.out.print(" "+i*j+" ");
			}
			if (i == breakLimit) {
				break outer;
			}
		}

	}

}
