package programming;

public class pattern_lower {

	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			for(int k=6; k>i; k--) {
				System.out.print(" ");
			}
			
			for(int l=6; l>i; l--) {
				System.out.print(" ");
			}
			
			for(int m=0; m<=i; m++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
