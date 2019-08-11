package programming;

public class numberofOccurence {
	
	static int count_occurence(int[] arr, int key, int n) {
		int i,j;
		i=first(arr, 0, n-1, key, n);
		if(i==-1)
			return i;
		j=last(arr,i,n-1,key,n);
		
		return j-i+1;
	}
	
	static int first(int[] arr, int low, int high, int key, int n) {
		if(high>=low) {
			int mid=(low+high)/2;
			if((mid==0||key>arr[mid-1]) && arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
				return first(arr, mid+1, high, key, n);
			else
				return first(arr, low, mid-1, key, n);
		}
		return -1;
	}
	
	static int last(int[] arr, int low, int high, int key, int n) {
		if(high>=low) {
			int mid=(low+high)/2;
			if((mid==n-1||key<arr[mid+1]) && arr[mid]==key)
			{
				return mid;
			}
			else if(key<arr[mid])
				return last(arr, low, mid-1, key, n);
			else
				return last(arr, mid+1, high, key, n);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,3,3};
		int n=arr.length;
		int key=3;
		int count=count_occurence(arr, key, n);
		System.out.println("Number of occurence of "+key+"is:"+count);

	}

}
