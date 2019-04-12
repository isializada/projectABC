public class CircularLists {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();
        LinkedList list = new LinkedList();
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(8);
        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(9);

        list.getAt(5).next = list.getAt(1);

        System.out.println(HaveAnyCircuar(list));
    }

    public static Boolean HaveAnyCircuar(LinkedList list){
        Node slow = list.getFirst();
        Node fast = list.getFirst();

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
