package com.example.demo.util.算法.二分查找;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                // 向右查找
                low = middle + 1;
            } else {
                // 向左查找
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch(array, 1);
        System.out.println(index);
    }
}
