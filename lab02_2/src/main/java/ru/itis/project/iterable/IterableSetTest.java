package ru.itis.project.iterable;

public class IterableSetTest {
    public static void main(String[] args) {
        Set503GenImpl<Fruit> set = new Set503GenImpl<>();
        set.add(new Fruit("Банан"));
        set.add(new Fruit("Груша"));
        set.add(new Fruit("Апельсин"));
        set.add(new Fruit("Лимон"));
        set.add(new Fruit("Яблоко"));


        for (Fruit f: set) {
            System.out.println(f);
        }



    }
}
