package utils;

import java.util.Random;

public class GenerateDataUtil {

    public static int[] getRandomData(int length) {
        if (length <= 0) return new int[0];
        int[] temp = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            temp[i] = random.nextInt(100);
        }
        return temp;
    }

    /**
     * 生成不重复的随机数
     *
     * @param length
     * @return
     */
    public static int[] getUnRepeatData(int length) {
        if (length <= 0) {
            return new int[0];
        }
        int[] temp = new int[length];
        Random random = new Random();
        int ranNum;
        for (int i = 0; i < length; i++) {
            /**
             * 如果生成的数据已经存在，则再次生成
             */
            while (hasExists(temp, i, ranNum = random.nextInt(1000))) {
            }
            temp[i] = ranNum;
        }
        return temp;
    }

    static boolean hasExists(int[] nums, int endIndex, int num) {
        for (int i = 0; i < endIndex; i++) {
            if (nums[i] == num) {
                return true;
            }
        }
        return false;
    }
}
