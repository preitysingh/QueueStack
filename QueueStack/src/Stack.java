/**
 * Stack
 * Author: Lilly Phan
 * Date: 11/05/2022
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

//an object representing data structure Stack
public class Stack<E>{
    private StackNode<E> top = null; //reference to the "top" Node of the Stack
    private int size = 0; //number of elements in Stack

    //empty constructor
    public Stack(){}

    //returns instance data size
    public int size(){
        return size;
    }

    //returns true if stack is empty
    public boolean isEmpty(){
        return (top == null);
    }

    public StackNode<E> getTop(){
        return top;
    }

    //adds a new element to the top of stack
    public void push (E element){
        top = new StackNode<E>(element, top);
        size++;
    }

    //deletes the element at the top of the stack
    public E pop(){
        E topData = null;
        if (isEmpty()){
            return null;
        } else {
            topData = top.getData();
            StackNode<E> oldTop = top;
            top = oldTop.getChild();
            oldTop.setChild(null);
            size--;
        }
        return topData;
    }

    //returns the data of the element at the top of the stack
    public E peek(){
        if (isEmpty()){
            return null;
        } else {
            return top.getData();
        }
    }
}