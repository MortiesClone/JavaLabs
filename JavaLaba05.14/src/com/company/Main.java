package com.company;

public class Main {

    public static void main(String[] args) {
        SortThread sortThread1 = new SortThread(SortThread.SortType.INSERT);
        SortThread sortThread2 = new SortThread(SortThread.SortType.CHOICE);
        SortThread sortThread3 = new SortThread(SortThread.SortType.BUBBLE);

        sortThread1.start();
        sortThread2.start();
        sortThread3.start();
    }
}
