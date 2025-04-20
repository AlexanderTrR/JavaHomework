package collections;

import java.util.Arrays;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public String get(int index) {
        return array[index];
    }

    public void add(String element) {
        array[size] = element;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;

    }

    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                remove(i);
                return;
            }
        }
    }

    public boolean addAll(MyArrayList c) {
        Object[] a = c.array;
        int numNew = c.size;
        if (numNew == 0)
            return false;

        if ((array.length == this.size + numNew) || (array.length < this.size + numNew)
        ) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(this.array, 0, newArray, 0, this.array.length);
            array = newArray;
        }
        System.arraycopy(a, 0, this.array, size, numNew);
        size = size + numNew;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}