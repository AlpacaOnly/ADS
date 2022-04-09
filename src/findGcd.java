import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class findGcd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(gcd(max(a,b), min(a, b)));
    }

    private static int gcd(int a, int b) {
        if(a==b) return a;
        return gcd(max(a-b,b), min(a-b, b));
    }

}
