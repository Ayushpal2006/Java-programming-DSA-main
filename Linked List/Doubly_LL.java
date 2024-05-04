public class Doubly_LL {
    private Node head;


    public void InsertFirst(int val){

        Node node = new Node(val);
        node.next=head;
        node.previous=null;
        if (head!=null){
            head.previous=node;
        }
        head=node;
    }

    public void Display() {
        Node temp = head;
        Node last=null;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            last=temp;
            temp = temp.next;
        }
        System.out.println("End");


        while (last != null) {
            System.out.print(last.val + "-->");
            last=last.previous;
        }
        System.out.println("Start");

    }

    private class Node{
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node previous) {
            this.val = val;
            this.next = next;
            this.previous = previous;
        }
    }
}
