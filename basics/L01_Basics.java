package basics;
import java.util.*;

public class L01_Basics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print pattern
        // System.out.println("*****");
        // System.out.println("   *");
        // System.out.println("  *");
        // System.out.println(" *");
        // System.out.println("*****");


        // Odd-Even
        // int a = 10;
        // if (a % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }


        // Largest No.
        // int a=21;
        // int b=31;
        // int c=24;
        // if(a>b && a>c){ //This is not true => a is not the ans. So, now, we just need to check for b & c
        //     System.out.println("a");
        // }
        // else if(b>c){   //Here, we don't need to check for b>a 
        //     System.out.println("b");
        // }
        // else{
        //     System.out.println("c");
        // }


        // Grading System
        // Scanner sc=new Scanner(System.in);
        // int marks=sc.nextInt();
        // if(marks>90){
        //     System.out.println("Excellent");
        // }
        // else if(marks>80){
        //     System.out.println("Good");
        // }
        // else if(marks>70){
        //     System.out.println("Fair");
        // }
        // else if(marks>60){
        //     System.out.println("Meets expectations");
        // }
        // else{
        //     System.out.println("Below par");
        // }


        // Prime No.
        int t=sc.nextInt();

        for(int n=1;n<=t;n++){
            int num = sc.nextInt();
            int factors = 0;
            for (int div = 2; div*div <= num; div++) {
                if (num % div == 0) {
                    factors++;
                    break;
                }
            }

            if (factors == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    //L02 was duplicate of L01

    }
}

