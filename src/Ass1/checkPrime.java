package Ass1;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        int i=2;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(isItPrime(n,i));
    }

    private static boolean isItPrime(int n, int i) {

        if (n==i) return true;
        if (n%i==0) return false;

        return isItPrime(n, i+1);
    }

}
