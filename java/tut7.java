// reverse an array 
public class HelloWorld{

    public static void main(String []args){
        int arr []={10,20,30,40,50,60,70,80,90,100};
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp= arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int j=0;j<n;j++){
       System.out.println( arr[j]+ " ");
    }
    }
}