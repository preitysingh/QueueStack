/**
 * StackNode
 * Author: Lilly Phan
 * Date: 11/05/2022
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: LP
 **/

//StackNode is a modified Node without a reference to a parent, basic unit of Stack
public class StackNode<E> {
    private StackNode<E> child;
    private E data;

    //empty constructor
    public StackNode(){}

    //constructor with one data parameter
    public StackNode(E data){
        this.data = data;
    }

    //constructor with two parameters for data and child Node
    public StackNode(E data, StackNode<E> child){
        this.data = data;
        this.child = child;
    }

    //accessors

    //returns data
    public E getData() {
        return data;
    }

    //returns child Node
    public StackNode<E> getChild() {
        return child;
    }

    //mutators

    //changes instance Node child to specified Node
    public void setChild(StackNode<E> child) {
        this.child = child;
    }

    //sets the data stored in Node to specified element
    public void setData(E data) {
        this.data = data;
    }

    //other

    @Override
    //overrides Objects' toString and returns a string specifying data of the Node
    public String toString() {
        return "Node: " + data;
    }

    //overrides Objects' equals and returns a string specifying whether the data of each Node is equal using .equals
    public boolean equals(StackNode<E> node) {
        return data.equals(node.data);
    }

}