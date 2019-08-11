package programming;

public class addPolynomial {
	
	static void add_Polynomial(int[] a, int m, int[] b, int n) {
		int size= (m>n)?m:n;
		int[] sum=new int[size];
		
		for(int i=0;i<m;i++) {
			sum[i]=a[i];
		}
		
		int k=b.length-1;
		for(int j=sum.length-1;j>=0;j--) {
			while(k>=0) {
				if(sum[j]==b[k]) {
					continue;
					k--;
				}
				else {
					sum[j]+=b[k];
					k--;
				}
			}
		}
		
		for(int c=0;c<sum.length;c++) {
			System.out.print(sum[c]);
		}
	}

	public static void main(String[] args) {
		int a[]= {4,2,5,1,2,0};
		int b[]= {3,1,7,0};
		int m=a.length;
		int n=b.length;
		
		add_Polynomial(a,m,b,n);
	}
}
