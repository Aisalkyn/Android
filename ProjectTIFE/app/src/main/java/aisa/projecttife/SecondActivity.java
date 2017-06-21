package aisa.projecttife;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by admin on 6/16/17.
 */

public class SecondActivity extends AppCompatActivity{
    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = (ListView)findViewById(R.id.listView);
        List<Model> list = new ArrayList<>();
        list.add(new Model("Aaaaa"));
        list.add(new Model("Bbbbb"));
        list.add(new Model("Ccccc"));
        list.add(new Model("Ddddd"));
        list.add(new Model("Eeeee"));
        list.add(new Model("Fffff"));
        list.add(new Model("Ffffef"));
        list.add(new Model("guguf"));
        list.add(new Model("Fffefwgff"));
        list.add(new Model("Fffefefff"));
        listView.setAdapter(new aisa.projecttife.ListAdapter(this, list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });
    }
}
