/**
 * testDriver - main class running test cases
 * Author: Lilly Phan And Preity Singh
 * Date: 01/17/2023
 **/
public class testDriver {
    public static void main(String[] args) {
        //testing for constructor
        QueueStack<Integer> sq = new QueueStack<>();
        QueueStack<Integer> sq1 = new QueueStack<>();
        System.out.println(sq.size());

        //testing for toString
        System.out.println("empty: " + sq);

        //testing for size
        System.out.println("0: " + sq.size());

        //testing for enqueue
        sq.enqueue(5);
        System.out.println("5: " + sq.peek());
        System.out.println("1: " + sq.size());
        System.out.println("5: " + sq);
        sq.enqueue(4);
        sq.enqueue(3);
        System.out.println("5 4 3: " + sq);

        //testing for dequeue + size
        System.out.println("first element(5): "+ sq.dequeue());
        System.out.println("2: "+ sq.size());
        System.out.println("second element(4) " + sq.dequeue());
        System.out.println("null: " + sq1.dequeue());

        //testing for peek + size
        System.out.println("3: " + sq.peek());
        System.out.println("null: " + sq1.peek());
        System.out.println("1: " + sq.size());
    }
}
