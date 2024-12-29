package Basics;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,30,20,50,89,3};
		int n =arr.length;
		int sndLargest = getsecondLargest(arr,n);
		System.out.println(sndLargest);
	}
	//Optimal approach
	static int getsecondLargest(int arr[], int n) {
		int res=-1, largest=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest = i;
			}else if(arr[i]!=arr[largest]) {
				if(res==-1 || arr[i]>arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}
	
	
	
	
	/*
	 * Not the optimal approch
	static int getLargest(int[] arr, int n) {
		int max = 0;
		for(int i=1;i<n;i++) {
			if(arr[i]> arr[max])
				max = i;
		}
		return max;
	}
	
	static int getsecondLargest(int [] arr, int n) {
		int largest= getLargest(arr,n);
		int res= -1;
		for(int i=0;i<n;i++) {
			if(arr[i] != arr[largest]) {
				if(res==-1) {
					 res=i;
				}else if(arr[i]>arr[res]) {
					res=i;
				}
			}
		}
		return res;
	}
	*/

}
