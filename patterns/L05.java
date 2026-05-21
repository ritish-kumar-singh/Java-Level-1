package patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class L05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        // Pattern-7
        // int spaces=0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }
        //     System.out.print("* ");
            
        //     System.out.println();
        //     spaces++;
        // }


        // Pattern-8
        // int spaces=n-1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }
        //     System.out.print("* ");
            
        //     System.out.println();
        //     spaces--;
        // }


        // Pattern-7
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern-8
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j==n+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern-9 : Mixture of Pattern 7 & Pattern 8
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j || i+j==n+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        // Pattern-10 : Write code for pattern 5 with a slight change
        // int spaces=n/2;
        // int stars=1;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }
            
        //     for(int j=1;j<=stars;j++){
        //         if(j==1 || j==stars){   //add this if-else in pattern-5
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();

        //     if(i<=n/2){
        //         spaces--;
        //         stars+=2;
        //     }
        //     else{
        //         spaces++;
        //         stars-=2;
        //     }
        // }


        // // Pattern-11
        // int val=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(val + " ");
        //         val++;
        //     }
        //     System.out.println();
        // }


        // Pattern-12 - Fibonacci + Pattern 1
        // int a=0,b=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int c=a+b;
        //         System.out.print(a + " ");
        //         a=b;
        //         b=c;
        //     }
        //     System.out.println();
        // }


        // Pattern-13 -> Pascal's Triangle
        for(int i=0;i<=n-1;i++){
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val + " ");
                val=val*(i-j)/(j+1);
            }
            System.out.println();
        } 
    }
}
