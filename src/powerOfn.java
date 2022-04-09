public class powerOfn {
    public static void main(String[] args) {
        System.out.println(makePower(2,3));

    }

    public static int makePower(int a, int n) {
        if (n!=0) return a*makePower(a, n-1);
        else return 1;
    }
}
