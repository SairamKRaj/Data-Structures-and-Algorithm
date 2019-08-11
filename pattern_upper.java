package programming;

public class pattern_upper {

	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			for(int j=7; j>i; j--) {
				System.out.print("*");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int l=7; l>i; l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
