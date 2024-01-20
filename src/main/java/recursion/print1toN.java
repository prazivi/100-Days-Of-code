package recursion;

public class print1toN {
    public static void main(String[] args) {
        print(10,1);
    }
//    static void print(int n){
//        // non tail-recursive solution
//        if(n==0){
//            return;
//        }
//        print(n-1);
//        System.out.println(n);
//
//
//    }
    static void print(int n,int k){
        if (n == 0) {
            return;
        }
        System.out.println(k);
        print(n-1,k+1);
    }
}
