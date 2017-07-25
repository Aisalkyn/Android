package aisa.w04p02playstore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

/**
 * Created by admin on 6/27/17.
 */

public class GridViewWind extends AppCompatActivity {

    GridView gridView;
    GridView grid;
    String[] web = {
            "Google",
            "Github",
            "Instagram",
            "Facebook",
            "Flickr",
            "Pinterest",
            "Quora",
            "Twitter",
            "Vimeo",
            "WordPress",
            "Youtube",
            "Stumbleupon",
            "SoundCloud",
            "Reddit",
            "Blogger"

    };

    int[] imageId = {
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
            R.drawable.img14,
            R.drawable.img15,
            R.drawable.img16,
            R.drawable.img17,
            R.drawable.img18,
            R.drawable.img19,
            R.drawable.img111,
            R.drawable.img112,
            R.drawable.img113,
            R.drawable.img111,
            R.drawable.img12,
            R.drawable.img15



    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        CustomGrid adapter = new CustomGrid(GridViewWind.this, web, imageId);
        gridView=(GridView)findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(getBaseContext(), "click event on more, ", Toast.LENGTH_SHORT).show();

               // Intent intent = new Intent(GridViewWind.this, SecondActivity.class);
                //startActivity(intent);

            }
        });




    }
}
