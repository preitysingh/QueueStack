public class QueueStack<E> {
    private Stack<E> in;
    private Stack<E> out;
    private int size = 0;

    public QueueStack() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public int size() {
            return size;
        }

    public boolean isEmpty() {
            return(in.isEmpty() && out.isEmpty());
        }
    public E dequeue(E element)    {
        E headData = out.peek();
        out = out.pop();
        size--;
        return headData;
    }
    public E peek(){
        if(isEmpty()){
            return null;
        }
        else if (out.isEmpty()) {

        }
    }
    public String toString(){
        String s = "";
        if (isEmpty()){
            return "empty";
        } else if (out.isEmpty()){
            for (int i = 0; i < size; i++){
                out.push(in.pop());
            }
        }
        StackNode<E> curr = out.getTop();
        for (int i = 0; i < size; i++){
            s = s.concat(curr.getData() + " ");
            curr = curr.getChild();
        }
        return s;
    }

}

