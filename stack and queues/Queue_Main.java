public class Queue_Main {
    public static void main(String[] args) throws StackExpectation {
        Dynamic_Queue queue = new Dynamic_Queue(5);
        queue.Push(1);
        queue.Push(2);
        queue.Push(3);
        queue.Push(4);
        queue.Push(5);
        queue.Push(6);
        queue.Push(7);

        System.out.println(queue.peek());
        System.out.println(queue.Pop());
//        System.out.println(queue.Pop());
//        System.out.println(queue.Pop());
//        System.out.println(queue.Pop());
//        System.out.println(queue.Pop());

        queue.display();

    }
}
