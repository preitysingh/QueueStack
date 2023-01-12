
public class QueueStack<E> {
        private Stack<E> in;
        private Stack<E> out;
        private int size = 0;
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

    //E enqueue
    //E dequeue
    //E peek
    //toString

}

