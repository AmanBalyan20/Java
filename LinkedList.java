public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;

//---------------Adding Value at First in LinkedList------------------------------------//        
        public void addFirst(int data){
            //Creation of New Node
            Node newNode = new Node(data);
            
            if (head == null){
                head = tail = newNode;
                return;
            }

            //newNode next points towards old head
            newNode.next = head;

            // Head of the list become newNode
            head = newNode;
        }
        
//---------------Adding Value at Last in LinkedList------------------------------------//        
        public void addLast(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
//---------------Printing values of  LinkedList------------------------------------//
        public void print(){
            Node temp  = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp= temp.next;
            }
            System.out.println("Null");
        }

    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.print();
        list.addFirst(0);
        list.print();
        list.addFirst(2);
        list.print();
        list.addFirst(1);
        list.print();
        list.addFirst(0);
        list.print();
        list.addLast(100);
        list.print();

    }
}
