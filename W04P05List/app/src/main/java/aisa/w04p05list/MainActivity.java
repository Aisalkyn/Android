package aisa.w04p05list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;

public class MainActivity extends AppCompatActivity {

    CarouselView customCarouselView;
    TextView textView;
    Button btnadress;
    Button btncont;
    Button btnserv;


    int[] sampleImages = {R.drawable.image01, R.drawable.image02, R.drawable.image03, R.drawable.image04, R.drawable.image02};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                startActivity(new Intent(MainActivity.this, Adress.class));

            }
        });

        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Contact.class));
            }
        });
        btnserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Serv.class));
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