package com.shenwenxiang;

import java.util.Arrays;

/**
 * author by shenwenxiang 20190219
 * 选择排序
 */
public class SectionSort {

    //查找数组中最小元素数字
    public static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallest_index = 0;
        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                smallest_index = i;
            }
        }
        return smallest;
    }

    public static int[] sectionSort(int[] array){
        int[] newArray = new int[array.length];
        int smallest;
        for(int i = 0; i < array.length; i++) {
            smallest = findSmallest(array);
            newArray[i] = smallest;
        }
        return newArray;
    }

    //数组的特性是，一旦初始化，则长度确定，所以要删除数组中元素，并且长度也随着删除而改变，则要重新建立数组
    public int[] delete(int index, int array[]) {
        //数组的删除其实就是覆盖前一位
        int[] arrNew = new int[array.length - 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.arraycopy(array, 0, arrNew, 0, arrNew.length);
        return arrNew;
    }

    public static void main(String[] args) {
        int[] array = {33,8,5,7,13,64,6,9,84,332};
        System.out.println(Arrays.toString(SectionSort.sectionSort(array)));
    }
}
