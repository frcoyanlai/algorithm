package sort;

import utils.GenerateDataUtil;
import utils.PrintArr;

public class Fast {
    public static void main(String[] args) {
        int[] arr = GenerateDataUtil.getData(100);
        System.out.println("排序前：");
        PrintArr.printArr(arr);
        fastSort(arr, 0, arr.length - 1);
        System.out.println("排序后：");
        PrintArr.printArr(arr);
    }

    static void fastSort(int[] arr, int begin, int end) {
        if (end <= begin) {
            return;
        }
        int left = begin;
        int right = end;
        int temp = arr[begin];
        while (left < right) {
            // ==条件的意义
            while (temp <= arr[right] && left < right) {
                right--;
            }
            arr[left] = arr[right];
            while (temp >= arr[left] && left < right) {
                left++;
            }
            arr[right] = arr[left];
        }
        //left==right
        arr[left] = temp;
        fastSort(arr, begin, left - 1);
        fastSort(arr, left + 1, end);
    }
}
