package recursion;

public class fib {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
    static int fibo(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fibo(n-1)+fibo(n-2);
    }
}




/*
        The Fibonacci sequence is a series of numbers in which each number
        (called a Fibonacci number) is the sum of the two preceding ones,
        usually starting with 0 and 1.
        The sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
        Mathematically, it is defined by the recurrence relation:

        F(n)=F(n−1)+F(n−2)
        with initial conditions:
        F(0)=0,F(1)=1

*/