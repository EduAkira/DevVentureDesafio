package com.example.catimgur.retrofit;

import com.example.catimgur.model.CatImgur;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ImgurAPI {

    @Headers("Authorization: Client-ID {{71f1aae615f7694}")
    @GET("gallery/search")
    Call<List<CatImgur>> getCatImgur(@Query("q") String data);
}
