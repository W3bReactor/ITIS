package generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Set503GenImpl set = new Set503GenImpl();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        System.out.println(set.size());
        System.out.println(set);
        set.remove(5);
        System.out.println(set);
        System.out.println(Arrays.toString(set.toArray()));
        set.clear();
        System.out.println(set);

    }
}
