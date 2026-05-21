package basics;

import java.util.*;

public class L03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FIBONACCI NUMBERS
        // int n = sc.nextInt();
        // int a = 0, b = 1;
        // for (int i = 1; i <= n; i++) {
        //     System.out.print(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }

        // COUNT DIGITS
        // int n = sc.nextInt();
        // int count=0;
        // while(n!=0){
        //     n/=10;
        //     count++;
        // }

        // System.out.println(count);

        //COUNT DIGITS - USING FOR LOOP
        // int n = sc.nextInt();

        // int count = 0;
        // for ( ; n != 0; n = n / 10) {
        //     count++;
        // }

        // System.out.println(count);



        // REVERSE A NUMBER
        // int n=sc.nextInt();

        // while(n!=0){
        //     System.out.println(n%10);
        //     n/=10;
        // }



        // DIGITS OF A NUMBER
        // int n=sc.nextInt();
        // int num=n;
        // int count=0;
        // while(num!=0){
        //     count++;
        //     num/=10;
        // }

        // int div=(int)(Math.pow(10,count-1)); 

        // while(div!=0){
        //     int r=n%div;    //remaining digits
        //     int q=n/div;    //first digit

        //     System.out.println(q);

        //     n=r;
        //     div/=10;
        // }


        
        // ROTATE A NUMBER
        // int n=sc.nextInt();
        // int k=sc.nextInt();

        // int num=n;
        // int count=0;
        // while(num!=0){
        //     count++;
        //     num/=10;
        // }

        // k=k%count;
        // while(k<0){
        //     k=k+count;
        // }

        // int div=(int)Math.pow(10,k);
        // int mul=(int)Math.pow(10,count-k);

        // int r=n%div;
        // int q=n/div;

        // int ans=(r*mul) + q;
        // System.out.println(ans);



        // GCD AND LCM
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();

        // int div=n1;
        // int dvd=n2;

        // if(n1>n2){
        //     div=n2;
        //     dvd=n1;
        // }

        // while(dvd%div!=0){
        //     int r=dvd%div;

        //     dvd=div;
        //     div=r;
        // }

        // int gcd=div;

        // // gcd*lcm = n1*n2
        // int lcm=(n1*n2)/gcd;

        // System.out.println("GCD = " + gcd);
        // System.out.println("LCM = " + lcm);




        // PRIME FACTORISATION OF A NUMBER
        int n=sc.nextInt();
        
        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                System.out.print(div + " ");    //prime factor
                n/=div;
            }
        } 

        if(n!=1){
            // this is a prime factor having value > root n
            //and there can be only one such factor
            System.out.println(n);
        }

    }
}
