/**
 * QueueStack - class that utilizes two stacks to mimic a queue structure
 * Author: Lilly Phan And Preity Singh
 * Date: 01/17/2023
 **/

public class QueueStack<E> {
    private Stack<E> in; //first stack
    private Stack<E> out; //second stack
    private int size = 0;

    //constructor
    public QueueStack() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public int size() {
        return size;
    } //returns size of stack

    public boolean isEmpty() {
            return(in.isEmpty() && out.isEmpty());
        } //returns true if both stacks are empty

    public E peek(){ //returns the top/first element in the queue
        if (out.isEmpty()) {
            for(int i = 0; i < size; i++){
                out.push(in.pop()); //...top(most recent) of 'in' stack gets popped & pushed to 'out'
            }
        }
        return out.peek();
    }

    public void enqueue(E element){ //adds element to the bottom of the queue
        if (!out.isEmpty()){ //if 2nd(out) stack has elements
            for (int i = 0; i < size; i++){
                in.push(out.pop()); //...then push them to the 1st(in) stack
            }
        }
        in.push(element); //add E element to top of 1st(in) stack
        size++; //increment size
    }

    public E dequeue(){ //pops and returns the top of the queue/first element put in comes out
        if(out.isEmpty() && !isEmpty()){ //if the 2nd(out) stack is empty and the 1st(in) isn't
            for(int i = 0; i < size; i++){
                out.push(in.pop()); //...top(most recent) of 'in' stack gets popped & pushed to 'out'
            }
        }
        size--; //decrement size
        return (out.pop());
    }

    public String toString(){ //returns the contents of the queue in a String and "empty" if the queue is empty
        String s = "";
        if (isEmpty()){ //if empty return "empty"
            return "empty";
        } else if (out.isEmpty()){ //move all elements to out stack to get a String with elements from front to back
            for (int i = 0; i < size; i++){
                out.push(in.pop());
            }
        }
        StackNode<E> curr = out.getTop(); //concat the data from the top of the stack down to a String
        for (int i = 0; i < size; i++){
            s = s.concat(curr.getData() + " ");
            curr = curr.getChild();
        }
        return s;
    }
}