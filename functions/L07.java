package functions;

import java.util.*;

public class L07 {

    public static int decimalToBinary(int n) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            //Divide by 2 and find remainder
            int rem = n % 2;
            n /= 2;

            //update ans with the help of remainder and power
            ans += rem * power;
            power *= 10;
        }

        return ans;
    }

    public static int decimalToOctal(int n) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            //Divide by 8 and find remainder
            int rem = n % 8;
            n /= 8;

            //update ans with the help of remainder and power
            ans += rem * power;
            power *= 10;
        }

        return ans;
    }

    public static int decimalToAnyBase(int n, int base) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            //Divide by base and find remainder
            int rem = n % base;
            n /= base;

            //update ans with the help of remainder and power
            ans += rem * power;
            power *= 10;
        }

        return ans;
    }

    public static int binaryToDecimal(int n) {
        int ans = 0;
        int power = 1;

        while (n != 0) {
            //find last digit
            int ld = n % 10;
            n /= 10;

            //update ans using last digit and power
            ans += ld * power;
            //update power
            power *= 2;
        }

        return ans;
    }

    public static int anyBaseToDecimal(int n, int base) {
        int ans = 0;
        int power = 1;

        while (n != 0) {
            //find last digit
            int ld = n % 10;
            n /= 10;

            //update ans using last digit and power
            ans += ld * power;
            //update power
            power *= base;
        }

        return ans;
    }

    public static int anyBaseAddition(int base, int n1, int n2) {
        int ans = 0;
        int power = 1;
        int carry = 0;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int ld1 = n1 % 10;
            int ld2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int sum = ld1 + ld2 + carry;
            int rem = sum % base;
            int q = sum / base;

            ans += rem * power;
            power *= 10;

            carry = q;
        }

        return ans;
    }

    public static int getProductWithSingleDigit(int base, int n1, int n2){  //n2 is single digit
        int ans=0;
        int carry=0;
        int power=1;

        while(n1!=0 || carry!=0){
            int ld=n1 % 10;  // last digit of n1
            n1/=10;

            int prod = (n2*ld)+carry;
            int rem = prod % base;
            int q= prod/base;

            ans+=rem*power;

            power*=10;
            carry=q;
        }

        return ans;
    }

    public static int anyBaseMultiplication(int base, int n1, int n2) {
        int ans=0;
        int power=1;

        while(n2!=0){
            int ld=n2 % 10; // last digit of n2
            n2 /=10;

            // Get product of n1 with single digit of n2
            int prodWithSingleDigit=getProductWithSingleDigit(base, n1, ld);

//            ans+=prodWithSingleDigit;  -> This is wrong because base will not be decimal always

            // Add the current product to the total answer
            ans=anyBaseAddition(base, ans, prodWithSingleDigit * power);

            power*=10;
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n = sc.nextInt();

        System.out.print("Enter the second number: ");
        int m = sc.nextInt();

        System.out.print("Enter the base: ");
        int b = sc.nextInt();

//        System.out.print("Enter the destination base: ");
//        int d = sc.nextInt();



        // System.out.println(decimalToBinary(n));
        // System.out.println(decimalToOctal(n));
        // System.out.println(decimalToAnyBase(n, b));
        // System.out.println(binaryToDecimal(n));
        // System.out.println(anyBaseToDecimal(n, b));
        //ANY BASE TO ANY BASE
        // int decimalNo=anyBaseToDecimal(n, b);
        // int ans=decimalToAnyBase(decimalNo, d);
        // System.out.println(ans);
        //ANY BASE ADDITION
//        System.out.println(anyBaseAddition(b, n, m));

        System.out.println(anyBaseMultiplication(b, n, m));
    }
}
