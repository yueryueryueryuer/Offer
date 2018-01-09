package sort;

import java.util.Arrays;

/**
 * @ClassName: BubbleSort
 * @Description:
 * @author: TaoXiaoFeng
 * @date: 2018/1/9 21:25
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 63, 2, 7, 4};
        bubbleSortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
