public class Stack_main {
    public static void main(String[] args) throws StackExpectation {
            Custom_Stack stack = new Dynamic_stack(5);

            stack.Push(1);
            stack.Push(2);
            stack.Push(3);
            stack.Push(4);
            stack.Push(5);
            stack.Push(6);
            stack.Push(7);


        System.out.println(stack.peek());
        System.out.println(stack.Pop());
//        System.out.println(stack.Pop());
//        System.out.println(stack.Pop());
//        System.out.println(stack.Pop());
//        System.out.println(stack.Pop());

        stack.display();
    }

}
