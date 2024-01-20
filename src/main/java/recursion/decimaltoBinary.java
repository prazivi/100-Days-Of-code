package recursion;

public class decimaltoBinary {
    public static void main(String[] args) {
        dtob(13);
    }
    public static void dtob(int n){
        if(n==0)
            return;
        dtob(n/2);
        System.out.println(n%2);

    }
}

// By this method we can convert decimal to binary number
// we just need to reverse the output to get the binary number
