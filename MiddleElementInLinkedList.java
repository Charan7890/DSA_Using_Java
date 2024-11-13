//Finding middle element in an linked list using two approaches.

import java.util.Scanner;


class Node{

  int data;

  Node next;


  Node(int data){

    this.data = data;

    this.next = null;

  }

}


public class MiddleElementInLinkedList{

  public static void main(String args[]){

    Node head=null, tail=null,newNode=null,temp=null;

    Node answer1 = null;

    Scanner sc = new Scanner(System.in);

    while(true){

      System.out.println("To enter an element press-1, to exit press-0:");

      int opt = sc.nextInt();

      if(opt==0){

        break;

      }

      else{

        System.out.println("Enter an element:");

        int element = sc.nextInt();

        newNode = new Node(element);

        if(head==null){

          head = newNode;

          tail = newNode;

        }

        else{

          tail.next = newNode;

          tail = newNode;

        }

      }

       

    }

    System.out.println("The elements are:");

    temp = head;

    while(temp!=null){

      System.out.print(temp.data+" -");

      temp = temp.next;

    }

    System.out.println("NULL");

    answer1 = middleElementMeth2(head);

    System.out.println("Middle element of the linked list is:"+answer1.data);

    sc.close();

  }


  public static Node middleElementMeth1(Node head){

    Node pointer = null;

    pointer = head;

    // finding out the size of a linked list to find the middle element.

    int count = 0;

    while(pointer!=null){

      count++;

      pointer = pointer.next;

    }

    int middle = (count/2) + 1;

    pointer = head;

    for(int i=0;i<middle-1;i++){

      pointer = pointer.next;

    }

    return pointer;

  }


  public static Node middleElementMeth2(Node head){

    Node tortoise=null,hare=null;

    // using tortoise and hare approach.

    // tortoise moves two steps whereas hare moves only one.

    tortoise = head;

    hare = head;

    try{

      while(tortoise!=null){

      tortoise = tortoise.next.next;

      hare = hare.next;

      }

    }

    catch(Exception e){

      // do nothing.

    }

    return hare;

  }  

}