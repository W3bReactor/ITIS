package set;

public class TestSetPerson {
    public static void main(String[] args) {
        Set503 set = new Set503Impl();

        set.add(new Person("John Doe", Gender.MALE));
        set.add(new Person("Masha", Gender.FEMALE));
        set.add(new Person("Sasha", Gender.MALE));
        set.add(new Person("Pasha", Gender.MALE));
        set.add(new Person("Ilhan", Gender.MALE));
        set.add("Something text");

        System.out.println(set);
        System.out.println(set.contains(new Person("Sasha", Gender.MALE)));

        Object[] persons = set.toArray();
        for (Object person: persons) {
            System.out.println(((Person) person).getGender());
        }
    }
}
