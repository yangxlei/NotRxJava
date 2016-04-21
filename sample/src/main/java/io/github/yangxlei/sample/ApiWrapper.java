package io.github.yangxlei.sample;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

import io.github.yangxlei.notrxjava.AsyncJob;
import io.github.yangxlei.notrxjava.Callback;

/**
 * Created by yanglei on 16/4/20.
 */
public class ApiWrapper {

    public  AsyncJob<List<Cat>>  queryCats(String query) {
        return new AsyncJob<List<Cat>>() {
            @Override
            public void start(Callback<List<Cat>> callback) {
                // do request cats
                callback.onResult(new ArrayList<Cat>());
            }
        };
    }

    public AsyncJob<Uri> store(Cat cat) {

        return new AsyncJob<Uri>() {
            @Override
            public void start(Callback<Uri> callback) {
                //do store cat
                callback.onResult(Uri.parse("www.genshuixue.com"));
            }
        };
    }
}
