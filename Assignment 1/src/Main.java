import java.util.Scanner;
public class Main {
    public static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }
    public static int sum(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sum(arr, i + 1);
    }
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    public static void reverse(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reverse(n - 1, sc);
        System.out.print(x + " ");
    }
    public static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }
    public static int length(String s) {
        if (s.equals("")) return 0;
        return 1 + length(s.substring(1));
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDigits(num);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println((double) sum(arr, 0) / n);
        int p = sc.nextInt();
        System.out.println(isPrime(p, 2) ? "Prime" : "Composite");
        int f = sc.nextInt();
        System.out.println(factorial(f));
        int fibN = sc.nextInt();
        System.out.println(fib(fibN));
        int a = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(a, pow));
        int k = sc.nextInt();
        reverse(k, sc);
        System.out.println();
        String s = sc.next();
        System.out.println(isDigits(s, 0) ? "Yes" : "No");
        String s2 = sc.next();
        System.out.println(length(s2));
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
    }
}