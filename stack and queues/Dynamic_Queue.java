public class Dynamic_Queue extends Circular_Queue{
    public  Dynamic_Queue(){
        super();
    }

    public Dynamic_Queue(int size){
        super(size);
    }

    @Override
    public Boolean Push(int item) {
        if(this.isFull()) {
            //double the size of array
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i % data.length];

            }
            front = 0;
            end = data.length;

            data = temp;
        }

        return super.Push(item);
    }
}
