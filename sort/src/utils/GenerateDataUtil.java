package utils;

import java.util.Random;

public class GenerateDataUtil {
    public static int[] getData(int length) {
        if (length <= 0) return new int[0];
        int[] temp = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            temp[i]=random.nextInt(100);
        }
        return temp;
    }
}
