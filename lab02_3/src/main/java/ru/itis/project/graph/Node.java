package ru.itis.project.graph;

import java.util.Objects;

public class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null || !obj.getClass().equals(Node.class)) {
            return false;
        }
        System.out.println("тута");
        System.out.println(obj);
        return ((Node) obj).getName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return "N[" + this.name + "]";
    }
}
