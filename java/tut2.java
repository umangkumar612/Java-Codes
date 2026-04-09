/* Online Java Compiler and Editor */
public class HelloWorld{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            
        
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      public static void main(String []args){
          int arr[]={7,3,8,1,2};
          for(int i=0;i<arr.length-1;i++){
              for(int j=0;j<arr.length-i-1;j++){
                  if(arr[j]>arr[j+1]){
                      //swaping of two numbers
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
              }
              
         }
         sort(arr);
      }
 }