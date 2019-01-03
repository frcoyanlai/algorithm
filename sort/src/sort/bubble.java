package sort;

import java.util.Random;

public class bubble {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();
        System.out.println("排序前");
        for (int i = 0; i < 20; i++) {
            nums[i] = random.nextInt(100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后");
        for (int i = 0; i < 20; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
