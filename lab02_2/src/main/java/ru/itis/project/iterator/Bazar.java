package ru.itis.project.iterator;

public class Bazar implements Iterator<Fruit> {
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
}
