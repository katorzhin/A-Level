package homeWork.myArrayList;

public class MyArrayList<E> {
    private E[] array;
    int size = 0;

    public MyArrayList() {
        array = (E[]) new Object[10];

    }

    public void add(E elem) {
        if (size == array.length) {
            increaseArray();
        }
        array[size] = elem;
        size++;
    }

    private void increaseArray() {
        E[] newArray = (E[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void add(int index, E elem) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == array.length) {
            increaseArray();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = elem;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public E get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public void clean() {
        array = (E[]) new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        return sb.toString();
    }
}