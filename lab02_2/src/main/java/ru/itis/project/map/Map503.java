package ru.itis.project.map;

import ru.itis.project.list.List503;
import ru.itis.project.set.Set503Gen;

public interface Map503<K, V> {
    void put(K key, V value);
    V get(K key);
    int size();
    V remove(K key);
    void clear();

    Set503Gen<Entry<K, V>> entrySet();
    Set503Gen<K> keySet();
    List503<V> values();

    interface Entry<K, V> {
        K getKey();
        V getValue();
        void setKey(K key);
        void  setValue(V value);
    }
}
