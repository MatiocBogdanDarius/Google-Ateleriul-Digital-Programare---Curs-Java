package curs05.generics.challenge3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> implements IGenericList<T>{
    private IGenericNode<T> start;

    public GenericList(T value) {
        this.start = new GenericNode<>(value);
    }

    public GenericList(IGenericNode<T> start) {
        this.start = start;
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> lastGenericNode = start;
        while (lastGenericNode.getNext() != null){
            lastGenericNode = lastGenericNode.getNext();
        }
        lastGenericNode.setNext(new GenericNode<>(element));
    }

    @Override
    public void println() {
        IGenericNode<T> iterator = start;
        while (iterator.getNext() != null){
            System.out.println(iterator.getValue());
            iterator = iterator.getNext();
        }
    }
}
