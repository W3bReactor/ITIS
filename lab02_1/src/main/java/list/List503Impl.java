package list;

import java.lang.reflect.Array;

public class List503Impl<T> implements List503<T> {
    private int capacity = 3;
    private int currentSize = 0;
    private Object[] arr;


    public List503Impl() {
        this.arr = new Object[capacity];
    }


    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }


    private void updateArraySizeIfFull() {
        if(currentSize == capacity) {
            capacity *=2;
            Object[] temp = new Object[capacity];
            System.arraycopy(arr, 0, temp, 0, currentSize);
            arr = temp;
        }
    }

    @Override
    public void add(T value) {
        updateArraySizeIfFull();
        arr[currentSize++] = value;
    }

    @Override
    public void add(T value, int position) {
        if(position < 0 || currentSize < position) {
            throw new IndexOutOfBoundsException("Кол-во элементов в массиве + 1 < выбранная позиция.");
        }
        updateArraySizeIfFull();

        for (int i = currentSize; i > position; i--) {
            arr[i] = arr[i-1];
        }
        arr[position] = value;
        currentSize++;
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < size(); i++) {
            if(arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if(index < 0 || currentSize - 1 < index) {
            throw new IndexOutOfBoundsException("Элемента с таким индексом не найдено.");
        }
        Object value = arr[index];
        arr[index] = null;
        for (int i = index; i < currentSize-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[--currentSize] = null;
        return (T) value;
    }

    @Override
    public void clear() {
        arr = new Object[capacity];
        currentSize = 0;

    }

    @Override
    public T get(int index) {
        if(index < 0 || currentSize - 1 < index) {
            throw new IndexOutOfBoundsException("Элемента с таким индексом не найдено.");
        }
        return (T) arr[index];
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[currentSize];
        System.arraycopy(arr, 0, result, 0, currentSize);
        return result;
    }

    public T[] toArray(T classType) {
        T[] result = (T[]) Array.newInstance(classType.getClass(), currentSize);
        System.arraycopy(arr, 0, result, 0, currentSize);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < capacity; i++) {
            result.append(arr[i] + ", ");
        }
        result.append("]");
        return result.toString();
    }

}
