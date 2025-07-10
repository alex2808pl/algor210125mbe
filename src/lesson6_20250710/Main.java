package lesson6_20250710;

public class Main {
    public static void main(String[] args) {
        MyLinkedList lists = new MyLinkedList();
        System.out.println(" - pushToHead - ");
        lists.pushToHead(5);
        lists.pushToHead(3);
        lists.pushToHead(6);
        lists.print();

        System.out.println(" - pushToTail - ");
        lists.pushToTail(7);
        lists.print();

        System.out.println(" - pushToIndex - ");
        lists.pushToIndex(2, 88);
        lists.print();

        System.out.println(" - removeToHead - ");
        lists.removeToHead();
        lists.print();

        System.out.println(" - removeToTail - ");
        lists.removeToTail();
        lists.print();

        System.out.println(" - removeToIndex - ");
        lists.removeToIndex(1);
        lists.print();

        System.out.println(" - get - ");
        System.out.println("get(1) = "+lists.get(1));

        System.out.println(" - set - ");
        lists.set(1,55);
        lists.print();

    }
}
