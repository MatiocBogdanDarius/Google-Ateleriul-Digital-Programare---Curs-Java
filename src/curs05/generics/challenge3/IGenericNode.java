package curs05.generics.challenge3;

public interface IGenericNode<T> {
    T getValue();
    void setValue(T element);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}
