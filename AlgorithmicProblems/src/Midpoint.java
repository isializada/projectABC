

public class Midpoint {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();
        LinkedList list = new LinkedList();
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(8);
        list.insertLast(1);
        list.insertLast(3);

        Node result = FindMidpoint(list);
        System.out.println(result.data);
    }

    public static Node FindMidpoint(LinkedList list){
        Node slow = (Node) list.getFirst();
        Node fast = (Node) list.getFirst();

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
