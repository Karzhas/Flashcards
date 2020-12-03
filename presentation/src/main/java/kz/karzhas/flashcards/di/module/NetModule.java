package kz.karzhas.flashcards.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kz.karzhas.data.net.ApiConstants;
import okhttp3.Cache;

@Module
public class NetModule {
    @Provides
    @Singleton
    Cache provideOkHttpCache(Application application){
        Cache cache = new Cache(application.getCacheDir(), ApiConstants.CACHE_SIZE);
        return cache;
    }

//    @Provides
//    @Singleton
//    Gson provideGson() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//        return gsonBuilder.create();
//    }
//    @Provides
//    @Singleton
//    OkHttpClient provideOkHttpClient(Cache cache) {
//        OkHttpClient.Builder client = new OkHttpClient.Builder();
//        client.cache(cache);
//        return client.build();
//    }
//
//    @Provides
//    @Singleton
//    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
//        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .baseUrl(ApiConstants.BASE_URL)
//                .client(okHttpClient)
//                .build();
//        return retrofit;
//    }
}
