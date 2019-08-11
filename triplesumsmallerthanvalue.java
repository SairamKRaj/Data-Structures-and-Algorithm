package programming;

import java.util.Arrays;

public class tripletsumsmallerthanValue {
	
	static int smaller_sum_value(int arr[], int n, int target) {
		Arrays.sort(arr);
		int i,j,k;
		int result=0;
		
		for(i=0;i<n-2;i++) {
			j=i+1;
			k=n-1;
			while(k>j) {
				if(arr[i]+arr[j]+arr[k]<target) {
					result+=(k-j);
					j++;
				}
				else {
					k--;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {5,1,3,4,7,0};
		int n=arr.length;
		int target=8;
		int count=smaller_sum_value(arr, n, target);
		System.out.println("Number of triplets with sum smaller than given value is:");
		System.out.print(count);

	}

}
