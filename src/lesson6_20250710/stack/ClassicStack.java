package lesson6_20250710.stack;

public class ClassicStack {
//    empty  — проверка стека на наличие в нем элементов,
//    push  — операция вставки нового элемента,
//    pop  — операция удаления нового элемента.
//    peek - операция просмотра последнего вставленного элемента
//           (операция просмотра вершины стека)

    private final int[] arr;
    private int top; //индекс последнего пришедшего элемента
    private final int capacity; //общий размер структуры хранения

    public ClassicStack(int size) {
        this.capacity = size;
        arr = new int[this.capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1; // O(1)
    }

    public boolean isFull() {
        return top == capacity-1;
    }

    public int getSize() {
        return top+1;
    }

    public void printStack() {
        for (int i = 0; i <= top ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void push(int x) {
        if(isFull())
            System.out.println("Stack overflow");
        else {
            arr[++top] = x;
            System.out.println("Insert - " + x);
        }

        // В Java можно и так
//        try {
//            arr[++top] = x;
//            System.out.println("Insert - " + x);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Stack overflow");
//        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }


}
