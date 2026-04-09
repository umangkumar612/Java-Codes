public class umang {
    public static void main(String []args){
    
    int arr[]={19,4,2,56,34,7};
        int res=-1;
        int largest =0;
        int n =arr.length;
        if(n<2){
            System.out.println("insufficiant length");

        }
        for(int i=1;i<n;i++){
           if(arr[i]>arr[largest]){
            largest =i;
           }
        }
        System.out.println(arr[largest]);
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res=i;
                }
                else if(arr[i]>arr[res]){
                res=i;
            }
        }
    }
}
}
