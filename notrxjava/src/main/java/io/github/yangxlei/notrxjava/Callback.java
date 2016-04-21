package io.github.yangxlei.notrxjava;

/**
 * Created by yanglei on 16/4/20.
 */
public interface Callback<T> {
    void onResult(T result);

    void onError(Exception e);
}
