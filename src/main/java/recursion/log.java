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

// we can find log to the base 2 by this method
// if we want to find the base to the 3 then we just need to replace n/2 to n/3 and change the
// base condition to n>3
