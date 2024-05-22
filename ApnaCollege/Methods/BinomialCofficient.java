package ApnaCollege.Methods;

public class BinomialCofficient {
    public static void main(String[] args) {

        System.out.println(binomialCoff(5, 4));
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);

        int fact_nmr = factorial(n - r);

        int binCoff = fact_n / (fact_r * fact_nmr);

        return binCoff;

    }

}
