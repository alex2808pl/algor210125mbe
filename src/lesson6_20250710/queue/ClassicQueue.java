package lesson6_20250710.queue;

public class ClassicQueue {
//    empty — проверка очереди на наличие в ней элементов,
//    push — операция вставки нового элемента,
//    pop — операция удаления нового элемента,
//    size — операция получения количества элементов в очереди.
//    peek - операция просмотра элемента, который можно извлечь


    private int[] arr;
    private int head; // индекс извлекаемого элемента
    private int tail; //индекс для вставки нового элемента
    private int capacity; //общий размер структуры хранения
    private int count; //количество реальных элементов в очереди

    public ClassicQueue(int size) {
        this.capacity = size;
        arr = new int[capacity];
        head = 0;
        tail = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == capacity;
    }

    public void  printQueue() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("count - "+count );
    }

    private void moveQueue() { // перемещаем элементы
        for (int i = 1; i < count; i++) {
            arr[i-1] = arr[i];
        }
    }

    public int getSize() {
        return count;
    }

    public void push(int x) { //вставлять будем в конец массива
        if(isFull()) { //очередь заполнена
            System.out.println("Queue overflow");
        }
        else { //втавляем элемент
            tail++;
            arr[tail] = x;
            count++;
            System.out.println(x + " - add to the queue");
        }
    }

    public int pop() { //извлекает элемент из очереди
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int val = arr[head];
        moveQueue();
        count--;
        return val;
    }

    public int peek() { //просматривает элемент
        if(isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[head];
    }

}
