package Basics;

public class reverseArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5};
		int n=arr.length;
		reverse(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	static void reverse(int[] arr, int n) {
		int low=0,high=n-1;
		while(low<high) {
			int temp = arr[low];
			arr[low]=arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

}
