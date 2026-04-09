public class stack{
      int top=-1;
      int arr[]=new int [5];
      void push(int data){
        if(top==arr.length-1){
            System.out.println("stack is overflow");
        }
        else{
            top=top+1;
            arr[top]=data;
        }
      }
      void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }
        else{
            top=top-1;
        }
      }
    public static void main(String args[]){
        stack obj=new stack();
        ob.push(10);
        ob.pop()

    }
}