package ApnaCollege.Methods;

public class DecimalToBinary {
    public static void main(String[] args) {

        decimalToBinary(10);

    }

    public static void decimalToBinary(int n) {

        int myNum = n;

        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum += (int) Math.pow(10, pow) * rem;

            pow++;
            n /= 2;
        }

        System.out.println("Binary number of " + myNum + " is " + binNum);

    }

}
