package ru.itis;

public class LinkedList503 {
    private Node head;
    private int size;

    public void add(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public void add(int value, int n) {
        Node node = new Node(value);
        if(n == 0) {
            if(head != null) {
                node.next = head;
            }
            head = node;
        } else {
            if(n > size()) {
                System.out.println("Выбранный индекс > 1, чем размер списка");
                return;
            }
            Node current = head;
            for(int i = 0; i < n - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void remove(int n) {
        if(size() - 1 < n) {
            System.out.println("Элемента с индексом " + n + " и так не существует!");
            return;
        }
        if(n == 0) {
            head = head.next;
        } else {
            Node current = head;
            for(int i = 0; i < n - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int pop() {
        if(size() < 1) {
            System.out.println("Список и так пустой!");
            return -1;
        }
        Node current = head;
        Node prev = head;
        while(current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
        size--;
        return current.value;
    }

//    Не оптимизированное решение
//    public int size() {
//        int size = 0;
//        Node current = head;
//        while(current != null) {
//            size++;
//            current = current.next;
//        }
//        return size;
//    }

//    Оптимизированное решение
    public int size() {
        return size;
    }


    public int get(int n) {
        if(size() - 1 < n) {
            System.out.println("Выбранный индекс больше, чем размер списка");
            return -1;
        }
        Node current = head;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void showFullList() {
        Node current = head;
        System.out.println("Список:");
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }
}
