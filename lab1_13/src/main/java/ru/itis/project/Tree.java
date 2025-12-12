package ru.itis.project;

/*
    a - наш элемент
   b <= a < c

*/

import java.util.Arrays;

// Модификаторы доступа, интерфейс её реализация, все узнать некст кр
public class Tree implements IntCollection {
    private int capacity = 0;
    private Node root;
    private int size;
    private class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public void add(int value) {
        if (root == null)
            root = new Node(value);
        else
            add(value, root);
        size++;
    }

    private void add(int value, Node node){
        if (value <= node.value) {
            if (node.left == null) { // добавляем в левое поддерево
                Node v = new Node(value);
                node.left = v;
            }
//            else if (value > node.left.value && node.left.right != null && value <= node.left.right.value){
//                Node v = new Node(value);
//                v.right = node.left.right;
//                node.left.right = v;
//            } else if (value <= node.left.value && node.left.left != null && value >= node.left.left.value){
//                Node v = new Node(value);
//                v.left = node.left.left;
//                node.left.left = v;
//            }
            else  {
                add(value, node.left);
            }
        } else {
            if (node.right == null) { // добавляем в правое поддерево
                Node v = new Node(value);
                node.right = v;
            }
//            else if (value > node.right.value && node.right.right != null && value <= node.right.right.value){
//                Node v = new Node(value);
//                v.right = node.right.right;
//                node.right.right = v;
//            } else if (value <= node.right.value && node.right.left != null && value >= node.right.left.value){
//                Node v = new Node(value);
//                v.left = node.right.left;
//                node.right.left = v;
//            }
            else  {
                add(value, node.right);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String[] getPath(int value) {
        if(root == null) {
            return new String[]{};
        }
        this.capacity = (int) Math.log(size) + 2;
        String[] road = new String[capacity];




//        ["l", "r", ...]
//        capacity
        return getCurrentPath(root, road, value, "-1", -1);
    }




    private String[] getCurrentPath(Node node, String[] road, int value, String curr, int index) {
        Node left = node.left;
        Node right = node.right;
        if(!curr.equals("-1")) {
            road[index] = curr;
        }
        if(value == node.value) {
            for (int i = index+1; i < capacity; i++) {
                road[i] = null;
            }
            return road;
        }
        String[] result;
        if(left != null) {
            result = getCurrentPath(left, road, value, "l", index+1);
            if(result[0] != null) {
                return result;
            }
        }
        if(right != null) {
            result = getCurrentPath(right, road, value, "r", index+1);
            if(result[0] != null) {
                return result;
            }
        }
        return new String[capacity];
    }

    @Override
    public int max() {
        if(root == null) {
            return 0;
        }
        return findMax(root);
    }

    private int findMax(Node node) {
        if(node.right == null) {
            return node.value;
        }
        return findMax(node.right);
    }
    @Override
    public int min() {
        if(root == null) {
            return 0;
        }
        return findMin(root);
    }

    private int findMin(Node node) {
        if(node.left == null) {
            return node.value;
        }
        return findMin(node.left);
    }


    //    private String getCurrentPath(int countNodes, Node node, String result, boolean isRight) {
//        String prefix = "-".repeat(countNodes*5);
//        String spaces = " ".repeat(countNodes*5);
//
//        if (!isRight && node.right != null) {
//            result = result + spaces + prefix + node.value + getCurrentPath(countNodes/2, node.right, result, true);
//        } else if (!isRight && node.left != null) {
//            result = result + spaces + prefix + node.value + "\n" + getCurrentPath(countNodes/2, node.left, result, false);
//        }
//        if (isRight && node.left != null) {
//            result = result + spaces + node.value + prefix + "\n" + getCurrentPath(countNodes/2, node.left, result, false);
//
//        } else if (isRight && node.right != null) {
//            result = result + spaces + prefix + node.value + getCurrentPath(countNodes/2, node.right, result, true);
//        }
//        if(node.left == null && node.right == null) {
//            result = result + spaces + spaces + node.value;
//        }
//        return result;
//    }
    private String print(Node node){
        if (node == null){
            return "";
        }
//        if(node.left == null) {
//            return "";
//        }
//        return getCurrentPath(countNodes(node, 1), node.left, "", false);

        return node.value + print(node.left) + "right:" + print(node.right)+ ", ";
    }


    private int countNodes(Node node, int countNodes) {
        if(node != null) {
            return 1 + countNodes(node.left, countNodes+1) + countNodes(node.right, countNodes+1);
        }
        return 0;
    }


    @Override
    public String toString() {
        return print(root);
    }
}
