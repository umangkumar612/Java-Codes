public class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;   
        }
    }
    public void addfirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        
        newNode.next=head;
        head= newNode; 
    }
    public void addlast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
             Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data + " ->");
            currNode=currNode.next;
        }
       System.out.println("Null");
    }
    public static void main(String args[]){
        LL list= new LL();
        list.addfirst(5);
        list.addfirst(4);
        list.addfirst(3);
        list.printlist();
        
        list.addlast(6);
        list.addlast(7);
        list.printlist();
        
        list.addfirst(2);
        list.addfirst(1);
        list.printlist();
    }
}