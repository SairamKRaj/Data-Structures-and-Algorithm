package programming;

public class firstandlastOccurence {
	
	static int first(int arr[], int low,int high,int key) {
		if(high>=low) {
			int mid=(low+high)/2;
			if((mid==0||arr[mid-1]<key)&&arr[mid]==key)
				return mid;
			else if(key>arr[mid])
				return first(arr,mid+1,high,key);
			else
				return first(arr,low,mid-1,key);
		}
		return -1;
	}
	
	static int last(int arr[],int low,int high,int key) {
		int n=arr.length;
		if(high>=low) {
			int mid=(low+high)/2;
			if((mid==n-1||key<arr[mid+1])&&arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				return last(arr,low,mid-1,key);
			else
				return last(arr,mid+1,high,key);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1, 3, 5, 5, 5, 5 ,7, 123 ,125 };
		int n=arr.length;
		int key=7;
		System.out.println(first(arr,0,n-1,key));
		System.out.println(last(arr,0,n-1,key));
	}
}
