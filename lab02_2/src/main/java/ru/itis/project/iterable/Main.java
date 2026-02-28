package ru.itis.project.iterable;

public class Main {
/*
    Iterable - описание объекта как итерируемого (гарантия наличия итератора)
    interface Iterable<T>
    Iterator<T> iterator();
*/


    public static void main(String[] args) {
        Bazar bazar = new Bazar(new String[]{"apple", "pineapple", "banana", "orange", "pear"});

        for (Fruit f: bazar) {
            System.out.println(f);
        }
    }
}
