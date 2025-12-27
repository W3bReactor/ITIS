package ru.itis.project.treeException;

/*
    a - наш элемент
   b <= a < c

*/

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
            else  {
                add(value, node.left);
            }
        } else {
            if (node.right == null) { // добавляем в правое поддерево
                Node v = new Node(value);
                node.right = v;
            }
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
            throw new EmptyTreeException("Дерево пустое");
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
        if(left != null && node.value > value) {
            result = getCurrentPath(left, road, value, "l", index+1);
            if(result[0] != null) {
                return result;
            }
        }
        if(right != null && node.value < value) {
            result = getCurrentPath(right, road, value, "r", index+1);
            if(result[0] != null) {
                return result;
            }
        }
        throw new NotFoundException("Элемент не был найден");
    }

    @Override
    public int max() {
        if(root == null) {
            throw new EmptyTreeException("Дерево пустое");
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
            throw new EmptyTreeException("Дерево пустое");
        }
        return findMin(root);
    }

    private int findMin(Node node) {
        if(node.left == null) {
            return node.value;
        }
        return findMin(node.left);
    }


    private String print(Node node){
        if (node == null){
            return "";
        }
        if(node.left == null) {
            return "";
        }
        return  node.value + " " + print(node.left) + " " + print(node.right)+ ", ";
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
