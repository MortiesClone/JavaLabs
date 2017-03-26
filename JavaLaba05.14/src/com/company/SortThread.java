package com.company;

/**
 * Created by Вадим on 26.03.2017.
 */
public class SortThread extends Thread {

    private SortType sortType;

    enum SortType {
        INSERT, CHOICE, BUBBLE
    }

    public SortThread(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public void run() {
        super.run();

        Array a = new Array(100);

        switch (sortType) {
            case INSERT:
                a.insertSort();
                break;
            case CHOICE:
                a.choiceSort();
                break;
            case BUBBLE:
                a.bubbleSort();
                break;
        }
    }
}
