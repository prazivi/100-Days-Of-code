package recursion;

public class Count {
    public static void main(String[] args) {
        Nto1(5);
    }
    static void Nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n+"");
        Nto1(n-1);
    }
}
