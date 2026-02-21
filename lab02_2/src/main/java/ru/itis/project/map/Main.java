package ru.itis.project.map;


/*
    Map (карта, отображение, "словарь")
    Общие требования
    1. Набор пар (ключ: значение)
    2. Ключи unique
    3. При добавлении новой пары ключ-значение, то заменяем существующий

    Интерфейс Map503:
    1) void put(K, V)
    2) V или null get(K) Договорённость: нельзя отдавать K = null
    3) int size()
    4) V или null remove(K)
    5) void clear()
    6) entrySet() -> set of Entry
    7) keySet() -> set of Keys
    8) values() -> list of Values


    Хранение:
    interface Entry
    K key;
    V value;
*/
public class Main {
    public static void main(String[] args) {
        Map503Impl<Integer, String> map = new Map503Impl<>();
        map.put(1, "something");
        map.put(2, "something2");
        map.put(3, "something3");
        map.put(4, "somethin4");
        map.put(5, "something5");
        map.put(3, "какая-то надпись");

        System.out.println("Проверка toString");
        System.out.println(map);

        System.out.println("Проверка size");
        System.out.println(map.size());

        System.out.println("Проверка contains (Должна выдать true, т.к Pasha Male существует)");


        System.out.println("Проверка get");
        System.out.println(map.get(3));


        System.out.println("Проверка remove");
        System.out.println(map.remove(3));
        System.out.println(map);


        System.out.println("Проверка clear");
        map.clear();
        System.out.println(map);


    }
}
