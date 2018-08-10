package com.dicoding.paul.zodiac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    public DetailActivity() {}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Set the toolbar here
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        //Define all containers here, these containers receive data and display it in related activity
        ImageView imgPhotoReceived = findViewById(R.id.img_item_photo);
        TextView tvNameReceived = findViewById(R.id.tv_item_name);
        TextView tvRemarksReceived = findViewById(R.id.tv_item_remarks);
        TextView tvMythReceived = findViewById(R.id.tv_item_myth);
        TextView tvSymbolReceived = findViewById(R.id.tv_item_symbol);
        TextView tvElementReceived = findViewById(R.id.tv_item_element);
        TextView tvRulerReceived = findViewById(R.id.tv_item_ruler);

        //Create an object to get the data from intent using the unique key here
        Zodiac zodiac = (Zodiac) Objects.requireNonNull(getIntent().getExtras()).getSerializable("DATA");

        //Pass the data from object(zodiac) to container according to their types and voila
        if (zodiac != null) {
            Glide.with(getApplicationContext())
                    .load(zodiac.getPhoto())
                    .into(imgPhotoReceived);

            tvNameReceived.setText(zodiac.getName());
            tvRemarksReceived.setText(zodiac.getRemarks());
            tvMythReceived.setText(zodiac.getMyth());
            tvSymbolReceived.setText(zodiac.getSymbol());
            tvElementReceived.setText(zodiac.getElement());
            tvRulerReceived.setText(zodiac.getRuler());
        }
    }
}
