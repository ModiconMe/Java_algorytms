package list.array_list;

import java.util.Arrays;

public class GenericArrayList<E> {
    E[] arr;
    private int index;
    public GenericArrayList(int size) {
        arr = (E[]) new Object[size];
    }
    public void add(E el) {
        if (index >= arr.length) {
            E[] tempArr = (E[]) new Object[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        arr[index++] = el;
    }
    public E get(int index) {
        if (index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return arr[index];
        }
    }
    public boolean delete(int index) {
        if (index >= arr.length) {
            return false;
        } else if (arr[index] == null) {
            return false;
        } else {
            arr[index] = null;
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = null;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GenericArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
