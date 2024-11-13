import java.util.Scanner;

class Node {

    int data;

    Node next;

    Node(int data) {

          this.data = data;

          this.next = null;

    }

}

class LinkedList{
    public Node linkedlist(int []arr) {
        Node head = null, tail = null, newNode = null;
        
        for(int i=0;i<arr.length;i++){
            newNode = new Node(arr[i]);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;    
    }

    public static void displayLL(Node head) {

        Node temp = head;

        while (temp != null) {

              System.out.print(temp.data + "-");

              temp = temp.next;

        }

        System.out.println("NULL");

  }
}

public class DeleteMiddleNodeOfLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); //{10,20,30,40,50}; (n=5)
        int arr[] = {10,20};
        Node head = list.linkedlist(arr);
        Scanner sc = new Scanner(System.in);
        // Mention the position to delete the element from the above linked list.
        // {1-base index}
        //int position = sc.nextInt();
        //int n = 5;
        // Node temp = head;
        deleteMiddleNode(head);
        LinkedList.displayLL(head);
        sc.close();
    }

public static void deleteMiddleNode(Node head){
        // Using tortoise and hare approach.
        if(head==null || head.next == null){
            System.out.println("NULL");
        }

        Node tortoise = head, hare = head, previous = null;

        while(hare!=null && hare.next!=null){
            hare = hare.next.next;
            previous = tortoise;
            tortoise = tortoise.next;
        }

        previous.next = tortoise.next;

    }
    
}
