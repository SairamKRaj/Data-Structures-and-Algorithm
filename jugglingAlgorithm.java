package programming;

public class jugglingAlgorithm {
	
	static void left_rotate(int[] arr, int n, int d) {
		int j,k,temp;
		
		for(int i=0; i<gcd(n,d); i++) {
			temp=arr[i];
			j=i;
			
			while(true) {
				k=j+d;
				
				if(k>=n)
					k=k-n;
				
				if(k==i)
					break;
				
				arr[j]=arr[k];
				j=k;
			}
			
			arr[j]=temp;
		}
	}
	
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		else
			return(gcd(b, a%b));
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;
		left_rotate(arr, n, d);
		System.out.println("Left Rotated Array is:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
	
	}

}
