package com.example.catimgur.view;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.catimgur.R;
import com.example.catimgur.adapter.CatImgurAdapter;

import com.example.catimgur.model.CatImgur;
import com.example.catimgur.retrofit.RetrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Call<List<CatImgur>> request;
    RetrofitConfig retrofitConfig;
    CatImgurAdapter adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CatImgurAdapter();
        getAllImage();

    }

    public void getAllImage(){
        request = (Call<List<CatImgur>>) retrofitConfig.getCatImgurAPI().getCatImgur("cats");
        request.enqueue(new Callback<List<CatImgur>>() {
            @Override
            public void onResponse(Call<List<CatImgur>> call, Response<List<CatImgur>> response) {
               if(response.isSuccessful()){
                    List<CatImgur> catImgurs = response.body();
                    adapter.setData(catImgurs);
                    recyclerView.setAdapter(adapter);
               }
            }
            @Override
            public void onFailure(Call<List<CatImgur>> call, Throwable t) {
                Log.d("view.MainActivity", t.getMessage());
            }
        });
    }
}



