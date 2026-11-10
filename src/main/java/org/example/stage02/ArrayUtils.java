package org.example.stage02;

public class ArrayUtils {
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Mảng không được null hoặc rỗng");
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 1};
        int max = findMax(numbers);
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
