public class Student{
    String name;
    int age;
public void getdata(){
    System.out.println("enter the name of the student "+ this.name);
    System.out.println("enter the age of the student "  + this.name);
}
public static void main(String args[]){
    Student s1=new Student();
    s1.name="umang";
    s1.age="20";
    s1.getdata();

    Student st=new Student();
    st.name="kumar";
    st.age=19;
}
}