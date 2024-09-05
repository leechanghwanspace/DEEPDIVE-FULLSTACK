package org.example.Stack;


import org.example.LinkedList.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        T data = list.get(list.size() - 1);
        list.delete(list.size() - 1);
        return data;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
