package com.example.catimgur.retrofit;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit configBase;

    private String baseUrl = "https://api.imgur.com/3/";

    public RetrofitConfig() {

        configBase = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

    }

    public ImgurAPI getCatImgurAPI(){
        return configBase.create(ImgurAPI.class);
    }
}
