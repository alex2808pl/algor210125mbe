package lesson6_20250710;

public class MyLinkedList {
    protected Node head;

    // First element O(1)
    public void pushToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }

    // Last element O(n)
    public void pushToTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        // Find current last element
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);
    }

    // --- Index --- O(n/2)

    public void pushToIndex(int index, int data) {
        Node newNode = new Node(data);
        Node current = head;
        int jump;

        if (index < 1) {
            System.out.println("index out of bounds");
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    // O(1)
    public boolean removeToHead() {
        if (head == null) {
            return false;
        }
        head = head.getNext();
        return true;
    }

    // O(n)
    public void removeToTail() {
        if(head == null) return;

        Node current = head;
        Node previous = null;

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }

        if(previous != null)
            previous.setNext(null);
        else { // был всего один элемент в списке
            head = null;
        }

    }

    // O(n/2)
    public void removeToIndex(int index) {
        Node current = head;
        int jump;
        if (index < 1) {
            System.out.println("index out of bounds");
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            current.setNext(current.getNext().getNext());
        }
    }

    public int get(int index) {
        int jump = -1;
        if (head == null) {
            return -1;
        }

        Node node = head;
        while (node != null) {
            jump++;
            if (jump == index) {
                return node.getData();
            }
            node = node.getNext();
        }

        return -1;
    }

    public void set(int index, int data) {
        int jump = -1;
        Node node = head;
        if (head == null) {
            head.setData(data);
            return;
        }

        while (node != null) {
            jump++;
            if (jump == index) {
                node.setData(data);
                return;
            }
            node = node.getNext();
        }
        System.out.println(index+" - не найден");
    }


    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

}
