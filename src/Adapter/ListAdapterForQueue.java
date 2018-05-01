package Adapter;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ListAdapterForQueue<T> implements MyQueue {

    Queue<T> list;
    public ListAdapterForQueue(List<T> list1) {
        list = new ArrayDeque<T>();
        list.addAll(list1);
    }

    @Override
    public void enQueue(Object element) {
        list.offer((T) element);
    }

    @Override
    public Object deQueue() {
        return list.poll();
    }

    public String toString(){
        return list.peek().toString();
    }
}
