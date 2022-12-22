package curs05.generics.challenge4;

import curs05.generics.challenge3.GenericList;
import curs05.generics.challenge3.GenericNode;
import curs05.generics.challenge3.IGenericList;
import curs05.generics.challenge3.IGenericNode;


public class ArrayIterator<T> implements IArrayIterator<T> {
    private IGenericList<T> list;
    private IGenericNode<T> position;

    public ArrayIterator(T[] array) {
        this.position = new GenericNode<>(array[0]);
        this.list = new GenericList<>(this.position);
        for(int i = 1; i < array.length; i++){
            list.insert(array[i]);
        }
    }

    public boolean hasNext(){
        return position != null;
    }

    public T next(){
        IGenericNode<T> node = position;
        position = position.getNext();
        return node.getValue();
    }
}
