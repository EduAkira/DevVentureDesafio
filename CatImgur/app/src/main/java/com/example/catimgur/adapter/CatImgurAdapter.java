package com.example.catimgur.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.catimgur.R;

import com.example.catimgur.model.CatImgur;

import java.util.List;

public class CatImgurAdapter extends RecyclerView.Adapter<CatImgurAdapter.RecyclerViewHolder>{

    List<CatImgur> catImgurs;
    Context context;

   public CatImgurAdapter(){
   }
   public void setData(List<CatImgur> catImgurs){
       this.catImgurs = catImgurs;
       notifyDataSetChanged();
   }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_card, parent, false);

       return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
       CatImgur catImgur = catImgurs.get(position);

       holder.imageView.setImageResource(Integer.parseInt(catImgur.getData().getId()));
    }

    @Override
    public int getItemCount() {
        return catImgurs == null ? 0 : catImgurs.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

       ImageView imageView;

       public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView_received);
        }
    }
}
