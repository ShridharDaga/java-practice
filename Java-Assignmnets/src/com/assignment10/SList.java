package com.assignment10;

public class SList {

    public static void main(String[] args) {
        SListIterator list = new SListIterator();
        list = list.insert(list,5);
        list = list.insert(list, 10);
        list = list.insert(list, 15);
        list = list.insert(list, 25);

        list.printList(list);

        list = list.remove(list,15);

        list.printList(list);

    }
}



