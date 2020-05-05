package search;

import sort.Fast;
import utils.GenerateDataUtil;
import utils.PrintArr;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 20:25
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] temp = GenerateDataUtil.getUnRepeatData(20);
        Fast.fastSort(temp, 0, temp.length - 1);
        //int[] removeReptData = ;
        int testNum = temp[11];
        System.out.println(binarySearch(temp, testNum));
        PrintArr.printArr(temp);
    }

    static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // 注意
            } else if (nums[mid] > target) {
                right = mid - 1; // 注意
            }
        }
        return -1;
    }
}
