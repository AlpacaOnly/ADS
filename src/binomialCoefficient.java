import java.util.Scanner;

public class binomialCoefficient {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        System.out.println(findBinomial(n, k));
    }

    private static int findBinomial (int n, int k) {
        if (n==k || k==0) return 1;

        return findBinomial(n-1, k) +findBinomial(n-1, k-1);

    }
}
