package org.example;

public interface List<T> {
    void add(T data);
    T get(int index);
    void delete(int index);
    int size();
}
