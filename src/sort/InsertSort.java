package sort;

import java.util.Arrays;

/**
 * @ClassName: InsertSort
 * @Description: 插入排序
 * 假设前n-1个数已经排序好了，现在要把第n个数也进行排序，第n个数在n-1个数组中从右向左进行比较，大于则继续向左，小于就插入
 * @author: TaoXiaoFeng
 * @date: 2018/1/4 13:00
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 63, 2, 7, 4};
        insertSortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSortArr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
