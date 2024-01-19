package recursion;

public class log {
    public static void main(String[] args) {
        System.out.println(log2n(31));

    }
     public static int  log2n(int n){
        if(n==1){
            return 0;
        }else {
            return 1+ log.log2n(n/2);
        }
    }
}
