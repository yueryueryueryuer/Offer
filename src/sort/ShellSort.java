package sort;

import java.util.Arrays;

/**
 * @ClassName: ShellSort
 * @Description: 希尔排序
 * 进行分组，然后比对2个数，进行排序
 * @author: TaoXiaoFeng
 * @date: 2018/1/4 14:19
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 63, 2, 7, 4};
        shellSortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSortArr(int[] arr) {
        int i;
        int j;
        int temp;
        int gap = 1;
        int len = arr.length;
        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {
            for (i = gap; i < len; i++) {
                temp = arr[i];
                for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap) {
                    arr[j + gap] = arr[j];
                }
                arr[j + gap] = temp;
            }
        }
    }

}
