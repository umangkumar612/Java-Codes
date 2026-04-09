//factorial program using java
public class factorial{
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
            }
    }
    public static void main(String[] args){
        int f= fact(10);
        System.out.println(f);
    }
}