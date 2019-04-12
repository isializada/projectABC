public class FromLastLinkedList {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();
        LinkedList list = new LinkedList();
        list.insertLast(3);
        list.insertLast(6);
        list.insertLast(8);
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(9);
        list.insertLast(12);
        list.insertLast(10);

        System.out.println(FindDataFromNLast(list, 3));
    }

    public static Integer FindDataFromNLast(LinkedList list, int n){
        Node slow = list.getFirst();
        Node fast = list.getFirst();

        while(n > 0){
            fast = fast.next;
            n--;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}
