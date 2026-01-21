public class Practice {
    public static void main(String[] args) {
    //     Node head = new Node('g' , null);
      

    //     Node ryan = new Node('s', null);

    //     head.next = ryan;

    //     ryan.next = new Node('t' , null);


    //     ryan.next.next = new Node('x', null);
    //    // head.next.next.next = new Node('l', null);

    //    // System.out.println(head.next.next.value);
    //   // head = head.next;
    //    //printList(head);
    //    //Expect to return true
    //    System.out.println(contains(head, 'x'));
    //    // expect to print false
    //    System.out.println(contains(head, 'e'));

    //    remove(head, 't');
    MyLL<Character> list = new MyLL<>();
    list.addToBack('x');
    list.addToBack('m');
    list.addToBack('v');
    list.addToBack('q');

   // list.printList();
    list.printBackWards();

    MyLL<Integer> intList = new MyLL<>();
    intList.addToBack(5);
    intList.addToBack(99);
    intList.addToBack(2);
    intList.addToBack(-33333);
    intList.addToBack(66);

    }

    public static void printList(Node start) {
        Node current = start;

        while(current != null){
            System.out.println(current.value);
            current = current.next;

        }
    }

    public static boolean contains(Node start, char toFind) {
        Node head = start;

        while(head != null) {
            if(head.value == toFind) {
                return true;
            }
            head = head.next;
        }
            
        return false;
    }
    //remove the first node that has toRemove
    public static char remove(Node head, char toRemove) {
        Node current = head;

        while(current.next != null) {
            if(current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }

        return '\0';
    }
}
