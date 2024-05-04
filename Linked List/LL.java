public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("End");

    }

    public int Delete(int index) {
        if (index == 0) {
            DeleteFirst();
        }
        if (index == size-1) {
            DeleteLast();
        }
        Node pre=get(index-1);
        int val= pre.next.val;
        pre.next=pre.next.next;
        size--;

        return val;
    }

    public int DeleteLast() {
        if (size < 1) {
            DeleteFirst();
        }
        int val = tail.val;
        Node node = get(size - 2);
        tail = node;
        tail.next = null;
        size--;
        return val;
    }
    public int DeleteFirst(){
        int val=head.val;
        head=head.next;

        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node find(int Value) {
        Node temp = head;
        while (temp!=null){
            if (temp.val==Value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public Node get(int Index) {
        Node temp = head;
        for (int i = 0; i < Index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void Insert(int val, int index) {
        if (index == 0) {
            InsertFirst(val);
            return;
        }
        if (index == size) {
            InsertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void InsertLast(int val) {
        if (tail == null) {
            InsertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

