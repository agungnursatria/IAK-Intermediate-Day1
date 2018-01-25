package com.example.anb.weekone;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Agung Nursatria on 1/20/2018.
 */

public class DetailActivity extends AppCompatActivity{
    private ImageView detailImage;
    private TextView detailTitle;
    private TextView detailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = (ImageView) findViewById(R.id.detail_image);
        detailTitle = (TextView) findViewById(R.id.detail_title);
        detailText = (TextView) findViewById(R.id.detail_text);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        detailImage.setBackgroundResource(bundle.getInt("image"));
        detailTitle.setText(bundle.getString("title"));
        detailText.setText(bundle.getString("text"));

    }
}
