package list.linked_list;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        long startTime = System.currentTimeMillis();
        for (int i = 1_000_000; i > 0; i--) {
            myLinkedList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration);
        /*System.out.println("Before sort: " + myLinkedList.toString());
        LinkedList linkedListSortedUp = myLinkedList.sortUp();
        System.out.println("After sortUp: " + linkedListSortedUp.toString());
        LinkedList linkedListSortedDown = linkedListSortedUp.sortDown();
        System.out.println("After sortDown: " + linkedListSortedDown.toString());*/

    }

}
