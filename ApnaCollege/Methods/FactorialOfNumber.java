package ApnaCollege.Methods;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);

    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
