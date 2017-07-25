package aisa.w04p04flippableastackview;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ViewListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }

    CarouselView customCarouselView;
    TextView textView;
    Button btnadress;
    Button btncont;
    Button btnserv;

    int[] sampleImages = {R.drawable.image01, R.drawable.image02, R.drawable.image03, R.drawable.image04, R.drawable.image02};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_list, container, false);

        customCarouselView = (CarouselView) view.findViewById(R.id.customCarouselView);
        customCarouselView.setPageCount(sampleImages.length);
        customCarouselView.setViewListener(viewListener);

        customCarouselView.reSetSlideInterval(0);
        customCarouselView.setSlideInterval(0);


        textView = (TextView) view.findViewById(R.id.textView);

        btnadress = (Button) view.findViewById(R.id.button);
        btncont = (Button) view.findViewById(R.id.button2);
        btnserv = (Button) view.findViewById(R.id.button3);


        btnadress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(v.getContext(), Adress.class);
                //v.getContext().startActivity(intent);
                //  startActivity(new Intent(SampleCarouselViewActivity.this, Adress.class));

            }
        });

        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(v.getContext(), Contact.class);
                //v.getContext().startActivity(intent);


            }
        });
        btnserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   startActivity(new Intent(MainActivity.this, Serv.class));
             //   Intent intent = new Intent(v.getContext(), Serv.class);
              //  v.getContext().startActivity(intent);
            }
        });
        return view;

    }

    ViewListener viewListener = new ViewListener() {
        @Override
        public View setViewForPosition(int position) {

            View customView = getActivity().getLayoutInflater().inflate(R.layout.view_custom, null, false);
            ImageView fruitImageView = (ImageView) customView.findViewById(R.id.fruitImageView);
            fruitImageView.setImageResource(sampleImages[position]);
            Log.d("success", position + "");
            return customView;
        }
    };

}


