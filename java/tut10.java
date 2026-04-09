class main{
    public static void main(String args[]){
    int arr[]={10,30,6,4,2,6,8};
    int max = 0;
    for(int i=1;i<arr.length;i++){
    if(arr[max] < arr[i]){
    max = i;
    int res=-1;
    }
    else{
        System.out.println("largest element "+ arr[max]);
    }
    for(int i=0;i<arr.length;i++){
        if(int i=0;i<arr.length;i++){
            if(res==-1){
                res=i;   
            }
            else if(arr[i]>arr[res]){
                res=i;
            }
        }
    }
    if (res!=-1){
        System.out.println("second largest element is "+ arr[res]);
        else{
            System.out.println("all elements are same");
        }
    }
    }
    System.out.println(max);
    }
    }