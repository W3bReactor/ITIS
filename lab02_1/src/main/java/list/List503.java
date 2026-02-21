package list;


public interface List503<T> {
    int size();
    boolean isEmpty();
    boolean contains(T o);
    void add(T value);
    void add(T value, int position); // (0 < i <= size)
    T remove(int index);
    void clear();
    T get(int index);
    Object[] toArray();
}
