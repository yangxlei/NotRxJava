package io.github.yangxlei.sample;

/**
 * Created by yanglei on 16/4/20.
 */
public class Cat implements Comparable<Cat> {
    public int value;

    @Override
    public int compareTo(Cat another) {
        return another.value - value;
    }
}
