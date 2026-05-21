package arrays;

import java.util.*;

public class L08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array1 : ");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of the array2 : ");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
    }

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;

        int[] ans=new int[n1+n2+1];

        int i=n1-1;
        int j=n2-1;
        int k=ans.length-1;

        int carry=0;

        while(k>=0){
            int sum=carry;

            if(i>=0){
                sum+=arr1[i];
            }
            if(j>=0){
                sum+=arr2[j];
            }

            if(sum>=10){
                carry=1;
                sum-=10;
            }
            else{
                carry=0;
            }

            ans[k]=sum;

            i--;
            j--;
            k--;
        }

        return ans;
    }
}
