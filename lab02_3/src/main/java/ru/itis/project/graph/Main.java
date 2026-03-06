package ru.itis.project.graph;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      Node, Set<Node>
        Graph graph = new Graph();

        /*
    'd': None,
    'a': {'d','c'},
    'f': {'d'},
    'g': {'d','c','f'},
    'c': None,
    'b': {'f','g','a','c'}

        */

        graph.add(new Node("d"));
        graph.add(new Node("a"), new Node("d"), new Node("c"));
        graph.add(new Node("f"), new Node("d"));
        graph.add(new Node("g"), new Node("d"), new Node("c"), new Node("f"));
        graph.add(new Node("c"));
        graph.add(new Node("b"), new Node("f"), new Node("g"), new Node("a"), new Node("c"));
        List<Node> sortedTopologySet = new ArrayList<>();

       while (!graph.isEmpty())
        {
            Set<Node> emptyNode = graph.getEmptyNodes();
            graph.removeEmptyNodes(emptyNode);
            sortedTopologySet.addAll(emptyNode);
        }
        System.out.println(sortedTopologySet);
    }
}
