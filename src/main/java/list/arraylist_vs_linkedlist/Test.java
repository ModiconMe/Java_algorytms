package list.arraylist_vs_linkedlist;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();

        long startTime;
        long endTime;
        long duration;
        System.out.println("ArrayList operation duration:");
        startTime = System.currentTimeMillis();
        for (int i = 100_000_00; i > 0; i--) {
            arrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".add() = " + duration);

        startTime = System.currentTimeMillis();
        arrayList.get(5);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".get() at the start = " + duration);

        startTime = System.currentTimeMillis();
        arrayList.get(90_000_00);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".get() at the end = " + duration);

        startTime = System.currentTimeMillis();
        arrayList.remove(10);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".remove() at the start = " + duration);

        startTime = System.currentTimeMillis();
        arrayList.remove(90_000_00);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".remove() at the end = " + duration);

        System.out.println("LinkedList operation duration:");
        startTime = System.currentTimeMillis();
        for (int i = 100_000_00; i > 0; i--) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".add() = " + duration);

        startTime = System.currentTimeMillis();
        linkedList.get(5);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".get() at the start = " + duration);

        startTime = System.currentTimeMillis();
        linkedList.get(90_000_00);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".get() at the end = " + duration);

        startTime = System.currentTimeMillis();
        linkedList.remove(10);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".remove() at the start = " + duration);

        startTime = System.currentTimeMillis();
        linkedList.remove(90_000_00);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println(".remove() at the end = " + duration);

    }
}
