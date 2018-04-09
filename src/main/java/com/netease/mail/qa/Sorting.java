package com.netease.mail.qa;

import org.junit.jupiter.api.Test;

public class Sorting {

    public void printArr(int [] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //选择排序
    public void selectSort(int [] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }



    @Test
    public void test() {
        int [] arr = {9, 7, 3, 5, 4};
        selectSort(arr);
        printArr(arr);
    }
}
