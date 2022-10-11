package com.assignment10;

public class SListIterator {

    Node head;

    public SListIterator insert(SListIterator list, int data){
        Node node = new Node(data);

        //If list is empty
        if(list.head == null)
            list.head = new Node(data);
        else {
            Node temp = list.head;
            while (temp.next != null) //traverse till last node
                temp = temp.next;

            temp.next = node;
        }
        return list;
    }

    public SListIterator remove(SListIterator list, int data){
            Node node = list.head;
            Node temp = null;

            //having single node and that to be removed
            if(node.next == null && node.data == data){
                list.head = null;
                System.out.println("removed " + data + " from linked list");
                return list;
            }

            while (node != null && node.data != data){
                temp = node;
                node = node.next;
            }

            if(node != null){
                temp.next = node.next;
                System.out.println("removed " + data + " from linked list");
            }

            if(node == null)
                System.out.println(data + " is not present in linked list, deletion not possible");

        return list;
    }

    public void printList(SListIterator list){
        Node node = list.head;

        //If list is empty
        if(list.head == null)
            System.out.println("list is empty!!");
        else{
            System.out.println("Singly Linked list :");
            while (node != null){
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.print("null\n");
        }
    }
}
