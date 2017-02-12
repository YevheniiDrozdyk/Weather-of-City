package com.indev.weatherofcity.network;

import com.indev.weatherofcity.BuildConfig;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Interceptor of API key.
 *
 * @author E.Drozyk
 * @version 1.0 1 Nov 2016
 */
class ApiKeyInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url().newBuilder()
                .addQueryParameter("appid", BuildConfig.API_KEY)
                .build();
        request = request.newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
