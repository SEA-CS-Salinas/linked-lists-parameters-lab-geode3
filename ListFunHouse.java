//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Giovani Zuniga

import static java.lang.System.*;

public class ListFunHouse {
    /**
     * Prints the entire linked list
     * @param list is the head of the linked list
     */
    public static void print(ListNode list) {
        ListNode current = list;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    /**
     * Counts the number of nodes in the linked list
     * @param list is the head of the linked list
     * @return The number of nodes present in the list
     */
    public static int nodeCount(ListNode list) {
        int count = 0;
        ListNode current = list;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    /**
     * Duplicates the first node of the linked list
     * @param list is the head of the linked list
     */
    public static void doubleFirst(ListNode list) {
        if (list != null) {
            list.setNext(new ListNode(list.getValue(), list.getNext()));
        }
    }

    /**
     * Duplicates the last node of the linked list
     * @param list is the head of the linked list
     */
    public static void doubleLast(ListNode list) {
        ListNode current = list;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new ListNode(current.getValue(), null));
    }

    /**
     * Removes every other node in the linked list
     * @param list The head of the linked list
     */
    public static void skipEveryOther(ListNode list) {
        ListNode current = list;
        while (current != null && current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            current = current.getNext();
        }
    }

    /**
     * Sets the value of every xth node in the linked list
     * @param list Is the head of the linked list
     * @param x Is the interval at which nodes should be updated
     * @param value Is the new value to set
     */
    public static void setXthNode(ListNode list, int x, Comparable value) {
        int count = 1;
        ListNode current = list;

        while (current != null) {
            if (count % x == 0) {
                current.setValue(value);
            }
            count++;
            current = current.getNext();
        }
    }

    /**
     * Removes every xth node in the linked list
     * @param list Is the head of the linked list
     * @param x Is the interval at which nodes should be removed
     */
    public static void removeXthNode(ListNode list, int x) {
        int count = 1;
        ListNode current = list;

        while (current != null && current.getNext() != null) {
            if (count % (x - 1) == 0) {
                current.setNext(current.getNext().getNext());
            }
            count++;
            current = current.getNext();
        }
    }
}
