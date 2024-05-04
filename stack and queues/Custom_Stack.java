public class Custom_Stack {
    protected int[] data;
    private static final int Default_Size=10;

    int ptr=-1;
    public Custom_Stack() {

        this(Default_Size);
    }

    public Custom_Stack(int size) {
        this.data = new int[size];
    }


    public Boolean Push(int item){
        if(isFull()){
            System.out.println("The Stack is Full");
            return false;
        }

        ptr++;
        data[ptr]=item;
        return true;
    }

    public int Pop() throws StackExpectation {

        if(isEmpty()){
            throw new StackExpectation("Cannot poped !!!!");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackExpectation {

        if(isEmpty()){
            throw new StackExpectation("Cannot peek !!!!");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr== data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }

    public void display() {
        for (int i = 0; i < ptr+1; i++) {
            System.out.print(data[i] + " --> ");
        }
        System.out.println("END");
    }


}
