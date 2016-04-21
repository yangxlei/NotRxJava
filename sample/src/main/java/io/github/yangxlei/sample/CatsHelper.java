package io.github.yangxlei.sample;

import android.net.Uri;

import java.util.List;

import io.github.yangxlei.notrxjava.AsyncJob;
import io.github.yangxlei.notrxjava.Func;

/**
 * Created by yanglei on 16/4/20.
 */
public class CatsHelper {
    private ApiWrapper mApiWrapper = new ApiWrapper();

    public AsyncJob<Uri> saveTheCutestCat(final String query) {

        final AsyncJob<List<Cat>> catsListAsyncJob = mApiWrapper.queryCats(query);

        final AsyncJob<Cat> cutestCatAsyncJob = catsListAsyncJob.map(new Func<List<Cat>, Cat>() {
            @Override
            public Cat call(List<Cat> cats) {
                return findCutestCat(cats);
            }
        });

        return cutestCatAsyncJob.flatMap(new Func<Cat, AsyncJob<Uri>>() {
            @Override
            public AsyncJob<Uri> call(Cat cat) {
                return mApiWrapper.store(cat);
            }
        });
    }

    private Cat findCutestCat(List<Cat> cats) {
        return new Cat();
    }

}
