package programming;

public class pattern_complete {

	public static void main(String[] args) {
		
		//Upper Portion
		for(int i=1; i<=7; i++) {
		//	int num1=0;
			for(int j=7; j>=i; j--) {
				System.out.print("*");
			}
			
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int l=1; l<i; l++) {
				System.out.print(" ");
			}
			
			for(int m=7; m>=i; m--) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		//Lower Portion
		for (int i=1; i<7; i++) {
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
