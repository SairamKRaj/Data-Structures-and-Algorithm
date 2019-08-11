package programming;

public class equilibriumIndex {
	
	static int equilibrium_index(int arr[], int n) {
		int sum=0;
		int left_sum=0;
		
		for(int i=0;i<n;i++)
			sum+=arr[i];
		
		for(int j=0; j<n; j++) {
			sum-=arr[j];
			
			if(left_sum==sum)
				return j;
			
			left_sum+=arr[j];
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {-7,1,5,2,-4,3,0};
		int n=arr.length;
		int result=equilibrium_index(arr,n);
		System.out.println("Equilibrium Index is:"+result);

	}
}
