package patterns;

import java.util.*;

public class L06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Pattern-15
        // int spaces = n / 2;
        // int stars = 1;
        // int outerVal = 1;
        // for (int i = 1; i <= n; i++) {
        //     int innerVal = outerVal;
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print(innerVal + " ");
        //         if (j <= stars / 2) {
        //             innerVal++;
        //         } else {
        //             innerVal--;
        //         }
        //     }
        //     System.out.println();
        //     if (i <= n / 2) {
        //         stars += 2;
        //         spaces--;
        //         outerVal++;
        //     } else {
        //         stars -= 2;
        //         spaces++;
        //         outerVal--;
        //     }
        // }



        // PATTERN-16
        // int stars = 1;
        // int spaces = 2 * n - 3;
        // for (int i = 1; i <= n; i++) {
        //     String val = "*";
        //     for (int j = 1; j <= stars; j++) {
        //         System.out.print(j + " ");
        //     }
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }
        //     if(i==n){
        //         stars--;
        //     }
        //     for (int j = stars; j >= 1; j--) {  // 1->stars ki jgh stars->1
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        //     spaces -= 2;
        //     stars++;
        // }



        // PATTERN-17
        // int stars = n;
        // int spaces = 0;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= stars; j++) {
        //         if (i > 1 && i <= n / 2 && j > 1 && j < stars) {
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        //     if (i <= n / 2) {
        //         spaces++;
        //         stars -= 2;
        //     } else {
        //         spaces--;
        //         stars += 2;
        //     }
        // }



        // PATTERN-19
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {   //first row
                    if (j <= n / 2 + 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i > 1 && i < n / 2 + 1) {    //upper middle half
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i == n / 2 + 1) {    //middle row
                    System.out.print("* ");
                } else if (i > n / 2 + 1 && i < n) {    //lower middle half
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i == n) {    //last row
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
