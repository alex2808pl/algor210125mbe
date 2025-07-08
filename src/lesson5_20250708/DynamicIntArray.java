package lesson5_20250708;

import java.util.Arrays;

public class DynamicIntArray {
    private int[] array;
    private int count; //количество добавленных элементов в массиве
    private int size; //размер нашего массива

    private float increment; // коэф. приращения размера массива

    public DynamicIntArray() {
        size = 5;
        increment = 2;
        array = new int[size];
    }

    public DynamicIntArray(int size, float increment) {
        this.size = size;
        this.increment = increment;
        array = new int[size];
    }

    // добавляет в конец массива
    public void add(int data) {
        if(count == size) {
            growSize();
        }
        array[count] = data;
        count++;
    }

    // добавление элемента в массив по индексу
    public void addAt(int index, int data) {
        if(index > size)
            System.out.println("Индекс не должен быть больше размера массива");

        if(count == size) {
            growSize();
        }

        for (int i = count-1; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = data;
        count++;

    }

    // удаляем последний элемент массива
    public void remove() {
        array[count-1] = 0;
        count--;
    }

    // удаление по индексу
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // shift all element of right side from given index in left
            }
            array[count - 1] = 0;
            count--;
        }
    }


    //измененние элемента массива
    public void set(int index, int data) {
        if(index < size) {
            array[index] = data;
        }
    }


    // расширям массив
    private void growSize() {
        int nSize = (int) (size * increment); //новый размер

        int[] temp = new int[nSize];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = nSize;

    }


    //печатать массив
    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return size;
    }
}
