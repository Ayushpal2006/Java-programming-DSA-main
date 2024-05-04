public class Queue {

    protected int[] data;
    private static final int Default_Size=10;

    int end=0;
    public Queue() {

        this(Default_Size);
    }

    public Queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end== data.length;
    }

    private boolean isEmpty(){
        return end==0;
    }

    public Boolean Push(int item){
        if(isFull()){
            System.out.println("The Stack is Full");
            return false;
        }

        data[end]=item;
        end++;

        return true;
    }

    public int Pop() throws StackExpectation {

        if(isEmpty()){
            throw new StackExpectation("Cannot poped !!!!");
        }
        int removed=data[0];


        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;

        return removed;
    }

    public int peek() throws StackExpectation {

        if(isEmpty()){
            throw new StackExpectation("Cannot peek !!!!");
        }

        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}

