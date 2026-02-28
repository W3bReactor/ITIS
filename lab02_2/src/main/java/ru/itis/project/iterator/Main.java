package ru.itis.project.iterator;


/*

Iterator<T> - базовый интерфейс
    boolean hasNext();
    T next();
*/

public class Main {
    public static void main(String[] args) {
        Bazar bazar = new Bazar(new String[]{"apple", "pineapple", "banana", "orange", "pear"});
            while(bazar.hasNext()) {
                System.out.println(bazar.next());
            }
    }
}
