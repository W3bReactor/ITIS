package ru.itis.project.treeException;

public interface IntCollection {
    void add(int value);
    int size();
    String[] getPath(int value) throws NotFoundException;
    int max() throws EmptyTreeException;
    int min() throws EmptyTreeException;

}
