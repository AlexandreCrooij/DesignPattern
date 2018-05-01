package Adapter;

import java.util.List;
import java.util.Stack;

public class ListAdapterForStack<T> implements MyStack
{

    Stack<T>list;
    public ListAdapterForStack(List<T> list2) {
        list = new Stack<>();
        list.addAll(list2);
    }

    @Override
    public void push(Object element) {
        list.push((T) element);
    }

    @Override
    public Object pop() {
        return list.pop();
    }

    public String toString(){
        return list.peek().toString();
    }
}
