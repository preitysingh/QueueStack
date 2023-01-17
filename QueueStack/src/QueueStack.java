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

    public E dequeue()    {
        if(out.isEmpty() && !isEmpty()){
            for(int i = 0; i < size; i++){
                out.push(in.pop());
            }
        }
        size--;
        return (out.pop());
    }

    public E peek(){
        if (out.isEmpty()) {
            return dequeue();
        }
        else if (in.isEmpty()){
            return (E) out.getTop();
        }
        return null;
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

