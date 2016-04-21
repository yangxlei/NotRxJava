package io.github.yangxlei.notrxjava;

/**
 * Created by yanglei on 16/4/21.
 */
public interface Func<T, R> {
    R call(T t);
}
