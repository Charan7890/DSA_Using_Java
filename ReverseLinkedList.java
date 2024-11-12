/*
 * Created on Tue Nov 12 2024
 *
 * author : Charan Naik
 * Description: Type your description here.
 */

import java.util.Scanner;

class Node {

      int data;

      Node next;

      Node(int data) {

            this.data = data;

            this.next = null;

      }

}

public class ReverseLinkedList {

      public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);

            Node head = null, tail = null, temp = null, newNode = null;

            while (true) {

                  int element = sc.nextInt();

                  newNode = new Node(element);

                  if (head == null) {

                        head = newNode;

                        tail = newNode;

                  }

                  else {

                        tail.next = newNode;

                        tail = newNode;

                  }

                  int option = sc.nextInt();

                  if (option == 0) {

                        break;

                  }

            }

            displayLL(head);

            // code to reverese the linked list in iterative approach.

            Node answer = reverseLinkedList(head);

            displayLL(answer);

      }

      public static void displayLL(Node head) {

            Node temp = head;

            while (temp != null) {

                  System.out.print(temp.data + "-");

                  temp = temp.next;

            }

            System.out.println("NULL");

      }

      public static Node reverseLinkedList(Node head) {

            Node prev = null, curr = null, ahead = null;

            if (head == null || head.next == null) {

                  return head;

            }

            else {

                  curr = head;

                  ahead = head.next;

                  while (ahead != null) {

                        prev = curr;

                        curr = ahead;

                        ahead = ahead.next;

                        curr.next = prev;

                  }

                  head.next = null;

                  head = curr;

                  return head;

            }

      }

}