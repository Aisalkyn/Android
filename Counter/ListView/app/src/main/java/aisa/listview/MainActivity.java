package aisa.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);


        List<Model> list = new ArrayList<>();
        list.add(new Model("AAAAA", "0", "0"));
        list.add(new Model("b", "0", "0"));
        list.add(new Model("c", "0", "0"));
        list.add(new Model("d", "0", "0"));
        list.add(new Model("a", "0", "0"));
        list.add(new Model("q", "0", "0"));

        listView.setAdapter(new ListAdapter(this, list));
    }
}
