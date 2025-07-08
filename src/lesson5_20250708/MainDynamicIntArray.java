package lesson5_20250708;

import java.util.ArrayList;

public class MainDynamicIntArray {
    public static void main(String[] args) {
        DynamicIntArray array = new DynamicIntArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.printArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        array.add(6);
        array.printArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        array.addAt(3,77);
        array.printArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        array.addAt(0,88);
        array.printArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        array.remove();
        array.printArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        array.removeAt(4);
        array.printArray();
        System.out.println("count = "+array.getCount());
        System.out.println("size = "+array.getSize());

        // используем пользовательский коэффициент приращения массива
        System.out.println("============== ");
        DynamicIntArray array1 = new DynamicIntArray(5, 1.4F);
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        System.out.println("count = "+array1.getCount()+" ---- size = "+ array1.getSize());
        array1.printArray();

        array1.add(6);
        System.out.println("count = "+array1.getCount()+" ---- size = "+ array1.getSize());
        array1.printArray();

    }
}
