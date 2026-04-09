// selection sort using insertion
public class main {
    public static void umang(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,4,1,7,5,2};
        for (int i=0;i<arr.length;i++){
            int small = i;
            for(int j=i+1;j<arr.lentght;j++){
                if(arr[small]>arr[j]){
                    j=small;
                }
            }
            // swapping of two number
            int temp= arr[small];
            arr[small]= arr[j];
            arr[j]=temp;
        }
        umang(arr);
    }

    
}
