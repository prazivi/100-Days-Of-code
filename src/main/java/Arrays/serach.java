package Arrays;

import java.util.Scanner;

public class serach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(EleSearch(arr,x));
    }
    static int EleSearch(int[] arr,int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
