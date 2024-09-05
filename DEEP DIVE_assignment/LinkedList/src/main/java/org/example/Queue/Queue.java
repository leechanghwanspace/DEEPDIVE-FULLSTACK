package org.example.Queue;


import  org.example.LinkedList.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T data) {
        list.add(data);
    }

    public T dequeue() {
        T data = list.get(0);
        list.delete(0);
        return data;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
