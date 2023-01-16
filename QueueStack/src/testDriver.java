public class testDriver {
    public static void main(String[] args) {
        //testing for constructor
        QueueStack<Integer> sq = new QueueStack<>();

        //testing for toString
        System.out.println("empty: " + sq);

        //testing for size
        System.out.println("0: " + sq.size());

        //testing for enqueue
        sq.enqueue(5);
        System.out.println("1: " + sq.size());
        System.out.println("5: " + sq);
        sq.enqueue(4);
        sq.enqueue(3);
        System.out.println("5 4 3: " + sq);
    }
}
