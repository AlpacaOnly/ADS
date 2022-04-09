import java.util.Scanner;

public class allDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        if (checkDigits(s, 0)) System.out.println("Yes");
        else System.out.println("No");
    }



    private static boolean checkDigits(String s, int i) {
        if(i==s.length()) return true;
        // base case
        if(s.charAt(i)>='0' && s.charAt(i)<='9') return checkDigits(s, i+1);
        return false;
    }
}
