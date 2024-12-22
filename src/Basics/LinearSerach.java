package Basics;

public class LinearSerach {

	public static void main(String[] args) {
		int [] arr = {1,2,7,8,9};
		int n =arr.length;
		int x= 9;
		int result = Search(arr,n,x);
		if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

	}
	static int Search(int[] arr, int n, int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
}
