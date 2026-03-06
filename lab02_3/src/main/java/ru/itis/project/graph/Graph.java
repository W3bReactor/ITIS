package ru.itis.project.graph;

import java.util.*;


/*

    graph {
        a: []
        b: []
    }

*/
public class Graph {
    Map<Node, Set<Node>> graphList;


    public Graph() {
        this.graphList = new HashMap<>();
    }

    public void add(Node node, Node ...dependencies) {
        HashSet<Node> hashSet = new HashSet<>(List.of(dependencies));
        graphList.put(node, hashSet);
    }

    public boolean isEmpty() {
        return graphList.isEmpty();
    }

//    Поиск узлов с пустыми зависимостями

    public Set<Node> getEmptyNodes() {
        HashSet<Node> emptyNodes = new HashSet<>();

        for(Map.Entry<Node, Set<Node>> entry: graphList.entrySet()) {
            if(entry.getValue().isEmpty()) {
                emptyNodes.add(entry.getKey());
            }
        }
        return emptyNodes;
    }
    public void removeEmptyNodes(Set<Node> emptyNodes) {
        for (Node emptyNode: emptyNodes) {
            graphList.remove(emptyNode);
        }
        System.out.println(emptyNodes);
        for (Map.Entry<Node, Set<Node>> entry: graphList.entrySet()) {
            entry.getValue().removeAll(emptyNodes);
        }
    }


}
