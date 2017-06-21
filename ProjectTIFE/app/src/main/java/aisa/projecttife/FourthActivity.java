package aisa.projecttife;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;
/**
 * Created by admin on 6/16/17.
 */

public class FourthActivity  extends AppCompatActivity {

        CarouselView customCarouselView;

        int[] sampleImages = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sample_carousel_view);

            customCarouselView = (CarouselView) findViewById(R.id.customCarouselView);
            customCarouselView.setPageCount(sampleImages.length);
            customCarouselView.setSlideInterval(4000);

            customCarouselView.setViewListener(viewListener);

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