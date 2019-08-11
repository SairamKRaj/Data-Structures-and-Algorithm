package programming;

public class r {
	
	public static int rainwater(int[] arr, int n) {
		int left_max=0;
		int right_max=0;
		int left=0, right=n-1;
		int water=0;
		
		while(left<=right) {
			if(arr[left]<arr[right]) {
				if(arr[left]>left_max) {
					left_max=arr[left];
				}
				else {
					water+=left_max-arr[left];
				}
				left++;
			}
			else {
				if(arr[right]>right_max)
					right_max=arr[right];
				else {
					water+=right_max-arr[right];
				}
				right--;
			}
		}
		
		return water;
	}

	public static void main(String[] args) {
		int[] arr= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int n=arr.length;
		System.out.println("Total rain water trapped is:"+rainwater(arr,n));
	}

}
