package patterns;

import java.util.Scanner;

public class L04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        // Pattern-1
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print( "* ");
        //     }
        //     System.out.println();
        // }
        
        
        // Pattern-2
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print( "* ");
        //     }
        //     System.out.println();
        // }


        // Pattern-2
        // int stars=n;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=stars;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     stars--;
        // }



        // Pattern-3
        // int spaces=n-1;
        // int stars=1;

        // for(int i=1;i<=n;i++){
        //     //Print spaces
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }

        //     //Print Stars
        //     for(int j=1;j<=stars;j++){
        //         System.out.print("* ");
        //     }
            
        //     //Press Enter
        //     System.out.println();

        //     spaces--;
        //     stars++;
        // }



        // Pattern-5
        // int spaces=n/2;
        // int stars=1;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }
            
        //     for(int j=1;j<=stars;j++){
        //         System.out.print("* ");
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
    }
}
