

public class LinkedList{
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