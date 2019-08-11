package programming;

public class fixedpointArray {
	
	static int fixed_point_search(int arr[], int low, int high) {
		if(high>=low) {
			int mid=(low+high)/2;
			if(mid==arr[mid])
				return mid;
			else if(mid>arr[mid])
				return fixed_point_search(arr,mid+1,high);
			else
				return fixed_point_search(arr,low,mid-1);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {-10,-5,0,3,7};
		int n=arr.length;
		int fixed_point=fixed_point_search(arr,0,n-1);
		System.out.println("Fixed point in the given aray is:"+fixed_point);

	}

}
