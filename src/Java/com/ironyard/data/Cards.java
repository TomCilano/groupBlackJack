package com.ironyard.data;

/**
 * Created by Tom on 10/20/16.
 */
public class Cards {
    public int value;
    private enum Suite;

    public Cards(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    {

    }

}
