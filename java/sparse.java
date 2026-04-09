import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows,cols,size,count=0;
        System.out.println("Enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the no of cols");
        int matrix = new int[rows][cols];
        System.out.println("enter the element of matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
           matrix [i][j]=sc.nextInt();
            }
        }
        System.out.println("the metrix is ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(matrix [i][j]);
            }
        }
    }
}
   