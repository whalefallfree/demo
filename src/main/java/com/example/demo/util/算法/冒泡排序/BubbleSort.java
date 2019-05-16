package com.example.demo.util.算法.冒泡排序;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int temp;
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 8, 4, 56, 7};
        bubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
