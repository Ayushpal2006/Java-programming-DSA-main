public class Dynamic_stack extends  Custom_Stack{
    public Dynamic_stack(){
        super();
    }

    public Dynamic_stack(int size){
        super(size);
    }

    @Override
    public Boolean Push(int item) {
        if(this.isFull()) {
            //double the size of array
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        return super.Push(item);
    }

}
