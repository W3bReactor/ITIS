package ru.itis.project.iterable;


import java.util.Iterator;

public class Bazar implements Iterator<Fruit>, Iterable<Fruit> {
    private Fruit[] fruits;
    private int capacity = 5;
    private int currentSize = 0;

    // Текущий индекс для метода next
    private int currentIndex = 0;

    public Bazar() {
        this.fruits = new Fruit[capacity];
    }

    public Bazar(String[] names) {
        this.fruits = new Fruit[capacity];
        for (int i = 0; i < names.length ; i++) {
            fruits[i] = new Fruit(names[i]);
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < fruits.length;
    }

    @Override
    public Fruit next() {
        // возвращаем текущий элемент и заранее сдвигаем индекс к следующему
        return fruits[currentIndex++];
    }

    @Override
    public Iterator<Fruit> iterator() {
        currentIndex = 0;
        return this;
    }
}
