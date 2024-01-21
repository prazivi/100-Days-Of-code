package recursion;

public class SumofDigit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(Calculatesum(n));
    }
    static int Calculatesum(int n){
        if(n<10){
            return n;
        }
        return n % 10 + Calculatesum(n / 10);
    }
}


/*
Iterative sol:

static int calculateSum(int n){
    int sum =0;
    while(n>=0){
    sum = sum + n %10;
    n = n/10;
    }
    return sum;
}
 */

/*
n%10 gives the last digit of a number
n/10 removes the last digit of the number
 */