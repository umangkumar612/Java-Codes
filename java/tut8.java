// find the largset number in the array
class main{
    public static void main(String args[]){
    int arr[]={10,30,6,4,2,6,8};
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
    if(max < arr[i]){
    max = arr[i];
    }
    }
    System.out.println(max);
    }
    }