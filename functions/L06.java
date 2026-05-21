package functions;

public class L06 {

    public static int getDigitFrequency(int n, int d) {
        int count = 0;

        while (n != 0) {
            int ld = n % 10;
            if (ld == d) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 1013451;
        int digit = 1;
        System.out.println(getDigitFrequency(n, digit));
    }
}
