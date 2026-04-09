import java.util.*;

public class uppertrangulermatrix{
       public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int arr[][]=new int[3][3];
        int sum=0;
        System.out.print("enter the values for row " );
        for(int i=0;i<3;i++){
         System.out.print("enter the values for colomn " );
         for(int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
         }
         System.out.println();
        }
        System.out.println();
         for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    sum =sum+arr[i][j];
                }
            }
         }  
         System.out.println("the sum fo upper tranguler matrix is " + sum);
             }
}