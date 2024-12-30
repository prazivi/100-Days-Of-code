package Basics;

public class CheckIfAnArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,7,8,9};
		int n =arr.length;
		System.out.println(isSorted(arr, n));

	}
	static boolean isSorted(int[] arr,int n) {
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) return false;
		}
		return true;
	}
	
	
}
	/*
	//Naive approach
	
	static boolean isSorted(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[j] < arr[i])
    				return false;
    		}
    	}

    	return true;
    } 

}
*/
