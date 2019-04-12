class Node{
    int data;
    Node next;

    Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    Node head;
    LinkedList(){
        this.head = null;
    }

    void insertFirst(Integer data) {
        this.head = new Node(data, this.head);
    }

    int size(){
        int counter = 0;
        Node node = this.head;

        while(node != null){
            counter++;
            node = node.next;
        }

        return counter;
    }

    Node getFirst(){
        return this.head;
    }

    Node getLast(){
        if (this.head == null) {
            return null;
        }
        Node lastNode = null;
        Node node = this.head;
        while(node != null){
            if(node.next == null){
                lastNode = node;
            }

            node = node.next;
        }

        return  lastNode;
    }

    void clear(){
        this.head = null;
    }

    void removeFirst(){
        this.head = this.head.next;
    }

    void removeLast(){
        if(this.head != null){
            if (this.head.next == null) {
                this.head = null;
            }
            Node previous = this.head;
            Node node = this.head.next;

            while (node.next != null) {
                previous = node;
                node = node.next;
            }

            previous.next = null;
        }
    }

    void insertLast(int data){
        Node last = this.getLast();

        if(last != null){
            last.next = new Node(data, null);
        }else{
            this.head = new Node(data, null);
        }
    }

    Node getAt(Integer index){
        if(this.head == null){
            return null;
        }
        int counter = 0;
        Node node = this.head;
        while(node != null){
            if(counter == index){
                return node;
            }
            counter++;
            node = node.next;
        }

        return null;
    }

    void removeAt(int index){
        if(this.head != null){
            if(index == 0){
                this.head = this.head.next;
            }

            Node previous = this.getAt(index - 1);
            if(previous != null && previous.next != null) {
                previous.next = previous.next.next;
            }
        }
    }

    void insertAt(int index, Integer data){
        if(this.head == null){
            this.head = new Node(data, null);
        }else if(index == 0){
            this.head = new Node(data, this.head);
        } else {
            Node previous = this.getAt(index - 1);
            previous.next = new Node(data, previous.next);
        }
    }
}
