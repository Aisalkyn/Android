package com.synnapps.example.carouselview;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class SampleCarouselViewActivity extends AppCompatActivity {

    CarouselView customCarouselView;
    TextView textView;
    Button btnadress;
    Button btncont;
    Button btnserv;


    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image3, R.drawable.image_4, R.drawable.image_5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_carousel_view);

        customCarouselView = (CarouselView) findViewById(R.id.customCarouselView);
        customCarouselView.setPageCount(sampleImages.length);
        customCarouselView.setSlideInterval(4000);

        customCarouselView.setViewListener(viewListener);

        textView = (TextView)findViewById(R.id.textView);

        btnadress = (Button) findViewById(R.id.button);
        btncont = (Button) findViewById(R.id.button2);
        btnserv = (Button) findViewById(R.id.button3);


        btnadress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SampleCarouselViewActivity.this, Adress.class));

            }
        });

        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SampleCarouselViewActivity.this, Contact.class));
            }
        });
        btnserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SampleCarouselViewActivity.this, Serv.class));
            }
        });



    }

    // To set custom views
    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {

            View customView = getLayoutInflater().inflate(R.layout.view_custom, null);
            ImageView fruitImageView = (ImageView) customView.findViewById(R.id.fruitImageView);
            fruitImageView.setImageResource(sampleImages[position]);

            return customView;
        }
    };


}
