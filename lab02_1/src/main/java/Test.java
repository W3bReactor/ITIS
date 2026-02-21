import generics.Gender;
import generics.Person;
import generics.Set503GenImpl;
import set.Set503Impl;

public class Test {
    public static void main(String[] args) {
        Set503GenImpl<Integer> set1 = new Set503GenImpl<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
//        set1.add("5");
//        set1.add(new Person());

        Integer[] someArr = set1.toArray(0);
        for (int i = 0; i < someArr.length-1; i++) {
            System.out.println(someArr[i] + someArr[i+1]);
        }

        Set503GenImpl<Person> setTest = new Set503GenImpl<>();
        setTest.add(new Person("John Doe", Gender.MALE));
        Person[] someArr2 = setTest.toArray(new Person("John sadasd", Gender.MALE));


        Set503Impl set2 = new Set503Impl();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(5);
        set2.add("5");
        set2.add(new Person());
//        Object[] someArr = set2.toArray();
//        for (int i = 0; i < someArr.length-1; i++) {
//            System.out.println(someArr[i] + someArr[i+1]);
//        }
//        System.out.println(set2);

//        int h = 1; // 4 byte, value = 1
//        Integer num1 = 5;
//        Integer num2 = 5;
//        int numTest = num1;
//        Integer plus = (int) num1 + (int) num2;
//        int plusPrimitive = 5 + 5;

//        int f = 5;
//        char t = 'g';



    }
}
