public class RecursionPrograms {

    // Factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Power (n^p) using recursion
    static int power(int n, int p) {
        if (p == 0)
            return 1;
        return n * power(n, p - 1);
    }

    // Fibonacci (nth term) using recursion
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Reverse number using recursion (with helper parameter)
    static int reverseNumber(int n, int rev) {
        if (n == 0)
            return rev;
        rev = rev * 10 + n % 10;
        return reverseNumber(n / 10, rev);
    }

    public static void main(String[] args) {
        // Factorial
        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact);

        // Power
        int pow = power(2, 5);
        System.out.println("2^5: " + pow);

        // Fibonacci nth term
        int fib = fibonacci(6);
        System.out.println("6th Fibonacci number: " + fib);

        // Reverse number
        int num = 12345;
        int reversed = reverseNumber(num, 0);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }
}
