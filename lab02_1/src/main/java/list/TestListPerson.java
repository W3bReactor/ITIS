package list;

import generics.Gender;
import generics.Person;

public class TestListPerson {
    public static void main(String[] args) {
        List503Impl<Person> list = new List503Impl<>();

//        Инициализация
//      Проверка add
        list.add(new Person("John Doe", Gender.MALE));
        list.add(new Person("Masha", Gender.FEMALE));
        list.add(new Person("Sasha", Gender.FEMALE));
        list.add(new Person("Pasha", Gender.MALE));
        list.add(new Person("Ilhan", Gender.MALE));

//      Проверка add (по индексу 3)
        list.add(new Person("Test", Gender.MALE), 3);

        System.out.println("Проверка toString");
        System.out.println(list);

        System.out.println("Проверка size");
        System.out.println(list.size());

        System.out.println("Проверка contains (Должна выдать true, т.к Pasha Male существует)");
        System.out.println(list.contains(new Person("Pasha", Gender.MALE)));


        System.out.println("Проверка get");
        System.out.println(list.get(3));


        System.out.println("Проверка remove");
        System.out.println(list.remove(3));
        System.out.println(list);

        System.out.println("Проверка toArray");
        Object[] persons = list.toArray();
        for (Object person: persons) {
            System.out.println(((Person) person).getGender());
        }

        System.out.println("Проверка toArray (типизированный)");
        Person[] persons2 = list.toArray(new Person());
        for (Person person: persons2) {
            System.out.println(person.getGender());
        }

        System.out.println("Проверка clear");
        list.clear();
        System.out.println(list);

        System.out.println("Проверка isEmpty");
        System.out.println(list.isEmpty());


    }
}
