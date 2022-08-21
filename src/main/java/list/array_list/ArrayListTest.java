package list.array_list;

import test_classes.Person;

public class ArrayListTest {
    public static void main(String[] args) {
        /*ArrayList myArrayList = new ArrayList(10);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            myArrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration);*/


        Person person1 = new Person(10,"Vladimir");
        Person  person2 = new Person(15,"Alex");
        Person person3 = new Person(2,"Mihail");
        Person person4 = new Person(35,"Sergay");
        Person person5 = new Person(100,"Masha");

        GenericArrayList<Person> genericArrayList = new GenericArrayList(2);
        genericArrayList.add(person1);
        genericArrayList.add(person2);
        genericArrayList.add(person3);
        genericArrayList.add(person4);
        genericArrayList.add(person5);
        System.out.println(genericArrayList.toString());
        System.out.println(genericArrayList.get(2));
        System.out.println(genericArrayList.delete(2));
        System.out.println(genericArrayList.toString());
    }

}
