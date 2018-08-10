package com.dicoding.paul.zodiac;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewZodiacAdapter extends RecyclerView.Adapter<CardViewZodiacAdapter.CardViewViewHolder>  {
    private ArrayList<Zodiac>listZodiac;
    private Context context;

    CardViewZodiacAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Zodiac> getListZodiac() {
        return listZodiac;
    }

    public void setListZodiac(ArrayList<Zodiac> listZodiac) {
        this.listZodiac = listZodiac;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_zodiac, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {

        Zodiac z = getListZodiac().get(position);

        Glide.with(context)
                .load(z.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(z.getName());
        holder.tvRemarks.setText(z.getRemarks());
        holder.tvSymbol.setText(z.getSymbol());

        //Use serializable instead of parcelable to move object through intent for now -- easy to implement for a beginner
        //Arraylist is serializable by default, give it a unique key and put it into bundle then pass it to intent
        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener (position, new CustomOnItemClickListener.OnItemClickCallback(){

            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("DATA",listZodiac.get(position));
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListZodiac().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks, tvMyth, tvSymbol, tvElement, tvRuler;
        Button btnDetail;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            tvSymbol = itemView.findViewById(R.id.tv_item_symbol);
            tvMyth = itemView.findViewById(R.id.tv_item_myth);
            tvElement = itemView.findViewById(R.id.tv_item_element);
            tvRuler = itemView.findViewById(R.id.tv_item_ruler);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
        }
    }
}
