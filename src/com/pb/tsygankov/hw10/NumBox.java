package com.pb.tsygankov.hw10;

import java.util.ArrayList;
import java.util.List;

public class NumBox<T extends Number> {
    private List<T> array;
    private int arrayLenth;

    public NumBox(int arrayLenth) {
        this.arrayLenth = arrayLenth;
        this.array = new ArrayList<T>(arrayLenth);
    }

    public void add(T t) throws Exception {
        if(array.size() >= arrayLenth) {
            throw new Exception();
        }
        array.add(t);
    }

    public T get(int t) throws Exception {
        return array.get(t);
    }

    public int length() {
        return array.size();
    }

    public double average() {
        double sum = 0;

        for(int i = 0; i < arrayLenth; i++) {
            sum += array.get(i).doubleValue();
        }

        return sum / arrayLenth;
    }

    public double sum() {
        double sum = 0;

        for(int i = 0; i < arrayLenth; i++) {
            sum += array.get(i).doubleValue();
        }
        return sum;
    }

    public T max() {
        T max = array.get(0);
        for(int i = 0; i < arrayLenth; i++){
            if(array.get(i).doubleValue() > max.doubleValue())
                max=array.get(i);
        }
        return max;
    }
}
