package sprint2.exercise2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        short[] array = {(short) 1, (short) 2, (short) 3};
        System.out.println(Arrays.toString(array));
        byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));
        System.out.println(Arrays.toString(transformedArray));
    }

    public static byte[] transformArray(short[] array, ShortToByteFunction function) {
        byte[] transformedArray = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            transformedArray[i] = function.applyAsByte(array[i]);
        }
        return transformedArray;
    }
}
