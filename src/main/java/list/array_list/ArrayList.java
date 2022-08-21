package list.array_list;

import java.util.Arrays;

public class ArrayList {
    private int index;
    private int[] arr;

    public ArrayList() {
        arr = new int[10];
    }
    public ArrayList(int size) {
        arr = new int[size];
    }

    public void add(int el) {
        if (index >= arr.length) {
            int[] tempArr = new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        arr[index++] = el;
    }
    public int get(int index) {
        if (index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return arr[index];
        }
    }
    public boolean delete(int index) {
        if (index >= arr.length) {
            return false;
        } else if (arr[index] == 0) {
            return false;
        } else {
            arr[index] = 0;
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
        }
        return true;
    }
    public void sort() {
        int max = arr[0];
        int temp = 0;
        int index = 0;
        for (int i = arr.length; i > 0; i--) {
            max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }

            }
            temp = arr[i-1];
            arr[i-1] = max;
            arr[index] = temp;
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "index=" + index +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public int getSize() {
        return arr.length;
    }
}
