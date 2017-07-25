package aisa.w04p01projectcourses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        List<Content> list = new ArrayList<>();
        list.add(new Content("Date"));


        listView.setAdapter(new aisa.w04p01projectcourses.ListAdapter(this, list));
    }
}
