package Ass1;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(FibonacciElement(5));
    }
    private static int FibonacciElement(int n) {
        if (n==0) return 0;
        else if (n==1 || n==2) return 1;

        return FibonacciElement(n-1)+FibonacciElement(n-2);
    }
}
