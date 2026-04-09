// write a java program to reverse an array without using a additional operation
public class reversearray{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        System.out.println("program : to reverse an array : ");
        int n=arr.length;
        System.out.println("array before reversed");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        for(int j=0;j<n/2;j++){
            // System.out.println(arr[j] + " ");
            // swapping of two numbers 
            int temp=arr[j];
            arr[j]=arr[n-j-1];
            arr[n-j-1]= temp;
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k] + " ") ;
        }
    }
}