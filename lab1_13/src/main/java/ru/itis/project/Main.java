package ru.itis.project;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(6);
        tree.add(4);
        tree.add(5);
        tree.add(7);
        tree.add(8);
        tree.add(15);
        tree.add(30);
        tree.add(17);
        tree.add(50);
//        tree.add(5);
//        tree.add(14);
//        tree.add(16);
//        tree.add(15);
//        tree.add(18);
//        tree.add(17);
        System.out.println(Arrays.toString(tree.getPath(50)));
        System.out.println(tree.max());
        System.out.println(tree.min());
        System.out.println(tree);
    }
}
