package programming;

import java.math.*;

public class fixedpointArraywithDuplicates {
	
	static int fixed_point_array(int arr[], int low, int high) {
		while(high>=low) {
			int mid=(low+high)/2;
			int mid_value=arr[mid];
			
			if(arr[mid]==mid)
				return mid;
			
			int left=fixed_point_array(arr, low, Math.min(mid_value, mid-1));
			
			if(left>=0)
				return left;
			
			return fixed_point_array(arr, Math.max(mid_value, mid+1), high);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= { -10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13 };
		int n=arr.length;
		System.out.println(fixed_point_array(arr, 0, n-1));

	}
}
