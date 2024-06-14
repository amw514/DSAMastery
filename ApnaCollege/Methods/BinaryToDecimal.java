package ApnaCollege.Methods;

public class BinaryToDecimal {

    public static void binaryToDecimal(int binNum) {
        int pow = 0;
        int decimal = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal += lastDigit * (int) Math.pow(2, pow);
            binNum /= 10;
            pow++;
        }

        System.out.println("Decimal number of" + binNum + " digits is " + decimal);

    }

    public static void main(String[] args) {

        binaryToDecimal(1010);

    }

}
