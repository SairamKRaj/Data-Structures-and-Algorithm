package programming;

public class multipleofThree {
	
	static int multiple_of_three(int arr[], int n, int key) {
		int[] counter = new int[key];
		int result=0;
		for(int i=0; i<n; i++){
			System.out.print(arr[i]%3);
			counter[arr[i]%3]++;		
		}
		System.out.println();
		for(int j=0; j<counter.length;j++)
			System.out.print(counter[j]);
		System.out.println();
		result+=(counter[0]*(counter[0]-1))/2+counter[1]*counter[2]+(counter[0]*(counter[0]-1)*(counter[0]-2))/6+(counter[1]*(counter[1]-1)*(counter[1]-2)/6)+(counter[2]*(counter[2]-1)*(counter[2]-2)/6)+(counter[0]*counter[1]*counter[2]);
		return result;
	}

	public static void main(String[] args) {
		int[] arr= {3,6,7,2,9};
		int n=arr.length;
		int key=3;
		int count=multiple_of_three(arr,n,key);
		System.out.println("Total number of elements which can be grouped in groups of 2 or 3 and whose sum is multiple of three is:");
		System.out.print(count);

	}

}
