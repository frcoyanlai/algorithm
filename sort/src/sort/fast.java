package sort;

import java.util.Random;

public class fast {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        System.out.print("排序前：");
        for (int i = 0; i < 100; i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        fastSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.print("排序后：");
        for (int i = 0; i < 100; i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }

    static void fastSort(int[] arr, int begin, int end) {
        if (end <= begin) {
            return;
        }
        int left = begin;
        int right = end;
        int index = left;
        while (left < end) {
            while (arr[index] < arr[right]) {
                right--;
            }
            index = right;
            swap(arr, index, right);
            while (arr[index] > arr[left]) {
                left++;
            }
            index = left;
            swap(arr, index, right);
        }
        fastSort(arr, begin, index);
        fastSort(arr, index, end);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
