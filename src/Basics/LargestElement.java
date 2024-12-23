package Basics;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {2,9,7,5,30,29};
		int n = arr.length;
		int res = largest(arr,n);
		System.out.println(res);

	}
	static int largest(int[] arr, int n) {
		int max = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]> max)
				max = arr[i];
		}
		return max;
	}

}
