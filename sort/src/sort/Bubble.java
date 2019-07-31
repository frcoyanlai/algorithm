package sort;

import utils.GenerateDataUtil;
import utils.PrintArr;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = GenerateDataUtil.getData(50);
        PrintArr.printArr(nums);
        sort(nums);
        System.out.println("排序后");
        PrintArr.printArr(nums);
    }

    public static void sort(int[] array){
        if(array==null){
            return;
        }
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
