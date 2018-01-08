package sort;

import java.util.Arrays;

/**
 * @ClassName: SelectSort
 * @Description: 简单选择排序
 * 取最小的数和第一个数交换位置，余下的数中取最小的和第二个数交换位置
 * @author: TaoXiaoFeng
 * @date: 2018/1/4 14:54
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 63, 2, 7, 4};
        selectSortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[index]) {
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index] =temp;
        }
    }
}
