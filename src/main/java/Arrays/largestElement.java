package Arrays;
import java.util.Scanner;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println(largest(arr));



    }
    static int largest(int[] arr){
        int res= 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>res){
                res = arr[i];
            }

        }
        return res;
    }
}
