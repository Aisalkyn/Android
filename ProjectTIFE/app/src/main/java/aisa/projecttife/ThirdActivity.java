package aisa.projecttife;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 6/16/17.
 */

public class ThirdActivity extends AppCompatActivity {
    ListView listView;
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        listView = (ListView)findViewById(R.id.listView2);
        imageView = (ImageView) findViewById(R.id.imageView2);
        List<Model2> list = new ArrayList<>();
        list.add(new Model2("Aaaaa", R.drawable.image1));
        list.add(new Model2("Bbbbb", R.drawable.image2));
        list.add(new Model2("Ccccc", R.drawable.image3));

        listView.setAdapter(new ListAdapter2(this, list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);

            }
        });
    }
}

