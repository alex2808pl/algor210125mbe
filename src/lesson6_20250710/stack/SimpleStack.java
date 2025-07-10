package lesson6_20250710.stack;

public class SimpleStack {
    public static void main(String[] args) {
        ClassicStack stack = new ClassicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // не вставиться
        stack.printStack();

        System.out.println("take out - "+stack.pop());
        stack.printStack();

        System.out.println("take out - "+stack.pop());
        stack.printStack();

        System.out.println("Size = "+stack.getSize());

        System.out.println("Top - "+stack.peek());
        stack.printStack();
    }
}
