public class Circular_Queue {

    protected int[] data;
    private static final int Default_Size = 10;

    int front = 0;
    int end = 0;
    int size = 0;

    public Circular_Queue() {

        this(Default_Size);
    }

    public Circular_Queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public Boolean Push(int item) {
        if (isFull()) {
            System.out.println("The Stack is Full");
            return false;
        }

        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int Pop() throws StackExpectation {

        if (isEmpty()) {
            throw new StackExpectation("Cannot poped !!!!");
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;

        return removed;
    }

    public int peek() throws StackExpectation {

        if (isEmpty()) {
            throw new StackExpectation("Cannot peek !!!!");
        }

        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}

