package programming;

public class pattern_rightside {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int x=1; x<i; x++) {
				System.out.print(" ");
			}
			for(int j=7; j>=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int k=2; k<=7; k++) {
			for(int y=6; y>k-1; y--) {
				System.out.print(" ");
			}
			for(int l=1; l<=k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
