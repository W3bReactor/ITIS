package ru.itis.project.map;

import ru.itis.project.list.List503;
import ru.itis.project.list.List503Impl;
import ru.itis.project.set.Set503Gen;
import ru.itis.project.set.Set503GenImpl;

import java.util.Arrays;
import java.util.Objects;

public class Map503Impl<K, V> implements Map503<K, V> {
    Entry<K, V>[] entries;
    int capacity = 3;
    int currentSize = 0;




    class EntryImpl<K, V> implements Entry<K, V> {
        private K key;
        private V value;

        public EntryImpl(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }


        @Override
        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "E[" + "key=" + this.key + ", value=" + this.value + "]";
        }


        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null || !obj.getClass().equals(EntryImpl.class)) {
                return false;
            }
            EntryImpl p = (EntryImpl) obj;
            return this.key.equals(p.key) && this.value.equals(p.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.key, this.value);
        }
    }

    public Map503Impl() {
        this.entries = new Entry[capacity];
    }


    private int contains(K key) {
        for (int i = 0; i < currentSize; i++) {
            if(entries[i].getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void put(K key, V value) {
        int index = contains(key);
        if(index >= 0)
        {
            entries[index].setValue(value);
        } else {
            if(currentSize == capacity) {
                capacity *=2;
                Entry<K, V>[] temp = new Entry[capacity];
                System.arraycopy(entries, 0, temp, 0, currentSize);
                entries = temp;
            }
            entries[currentSize++] = new EntryImpl<>(key, value);

        }
    }

    @Override
    public V get(K key) {
        int index = contains(key);
        if(index >= 0) {
            return entries[index].getValue();
        }
        return null;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public V remove(K key) {
        int index = contains(key);
        V value = null;
        if(index >= 0) {
            value = entries[index].getValue();
            entries[index] = null;
            for (int i = index; i < currentSize-1; i++) {
                entries[i] = entries[i+1];
            }
        }
        currentSize--;
        return value;
    }

    @Override
    public void clear() {
        entries = new Entry[capacity];
        currentSize = 0;
    }

    @Override
    public Set503Gen<Entry<K, V>> entrySet() {
        Set503GenImpl<Entry<K, V>> entrySet = new Set503GenImpl<>();
        for (int i = 0; i < currentSize; i++) {
            entrySet.add(entries[i]);
        }
        return entrySet;
    }

    @Override
    public Set503Gen<K> keySet() {
        Set503GenImpl<K> keySet = new Set503GenImpl<>();
        for (int i = 0; i < currentSize; i++) {
            keySet.add(entries[i].getKey());
        }
        return keySet;
    }

    @Override
    public List503<V> values() {
        List503Impl<V> listValues = new List503Impl<>();
        for (int i = 0; i < currentSize; i++) {
            listValues.add(entries[i].getValue());
        }
        return listValues;
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
