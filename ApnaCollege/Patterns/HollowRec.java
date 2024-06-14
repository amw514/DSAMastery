package ApnaCollege.Patterns;

public class HollowRec {
    public static void main(String[] args) {
        hollowRec(4, 5);
    }

    public static void hollowRec(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || j == 1 || i == totalRows || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}