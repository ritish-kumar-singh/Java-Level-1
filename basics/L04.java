package basics;
import java.util.*;

public class L04{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Inverse of a number
        int n=sc.nextInt();

        int inv=0;
        int i=1;
        while(n!=0){
            int ld=n%10;
            inv+= i * (int)Math.pow(10, ld-1);
            i++;
            n/=10;
        }

        System.out.println(inv);
    }
}