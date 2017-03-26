package com.company;

import java.util.Random;

/**
 * Created by Вадим on 26.03.2017.
 */
public class Array {
    private int arr[];
    private int arraySize;

    public Array(int arraySize) {
        this.arraySize = arraySize;

        arr = new int[arraySize];

        Random rnd = new Random();

        for(int i = 0; i < arraySize; i++) {
                arr[i] = rnd.nextInt();
        }
    }

    public void insertSort() {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){

            System.out.println("Insert Sort: " + toString());

            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }

    public void choiceSort() {
        for (int min=0;min<arr.length-1;min++) {

            System.out.println("Choice Sort: " + toString());

            int least = min;
            for (int j=min+1;j<arr.length;j++) {
                if(arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }

    public void bubbleSort() {
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println("Bubble Sort: " + toString());

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    @Override
    public String toString() {
        String str = "";

        for(int i = 0; i < arraySize; i++) {
            str += arr[i] + "\t";
        }

        return str;
    }
}
