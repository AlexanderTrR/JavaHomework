package collections;

import java.util.HashSet;

public class MyHashSet implements MySet {
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;
    private Entry[] array = new Entry[INITIAL_CAPACITY];

    @Override
    public boolean add(String str) {
        int position = getElementPosition(str, array.length);
        if (array[position] == null) {
            Entry entry = new Entry(str, null);
            array[position] = entry;
            size++;
            return true;
        } else {
            Entry existedElement = array[position];
            while (true) {
                if (existedElement.value.equals(str)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(str, null);
                    size++;
                    return true;
                } else {
                    existedElement = existedElement.next;
                }
            }
        }
    }

    @Override
    public boolean remove(String str) {
        int position = getElementPosition(str, array.length);
        if (array[position] == null) {
            return false;
        }
        Entry secondLast = array[position];
        Entry last = secondLast.next;
        if (secondLast.value.equals(str)) {
            array[position] = last;
            size--;
            return true;
        }
        while (last != null) {
            if (last.value.equals(str)) {
                secondLast.next = last.next;
                size--;
                return true;
            } else {
                secondLast = last;
                last = last.next;
            }
        }
        return false;
    }

    private int getElementPosition(String str, int arrayLength) {
        return Math.abs(str.hashCode()) % arrayLength;

    }

    private static class Entry {
        private String value;
        private Entry next;

        public Entry(String value, Entry next) {
            this.value = value;
        }
    }
}
