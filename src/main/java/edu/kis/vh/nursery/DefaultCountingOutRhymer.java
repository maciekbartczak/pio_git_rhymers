package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_VALUE = 12;
    public static final int MIN_VALUE = -1;
    public static final int MAX_VALUE_MINUS_ONE = 11;
    private int[] numbers = new int[MAX_VALUE];

    public int total = MIN_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MIN_VALUE;
    }

    public boolean isFull() {
        return total == MAX_VALUE_MINUS_ONE;
    }

    protected int peekaboo() {
        if (callCheck())
            return MIN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MIN_VALUE;
        return numbers[total--];
    }

}
