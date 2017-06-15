package aisa.listview02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
        list.add(new Model("Aaaaa", "bbbbnbbb", "0"));
        list.add(new Model("Bbbbb", "bbbbnbbb", "0"));
        list.add(new Model("Ccccc", "bbbbnbbb", "0"));
        list.add(new Model("Ddddd", "bbbbnbbb", "0"));
        list.add(new Model("Eeeee", "bbbbnbbb", "0"));
        list.add(new Model("Fffff", "bbbbnbbb", "0"));
        list.add(new Model("Ffffef", "bbbbnbbb", "0"));
        list.add(new Model("guguf", "bbbbnbbb", "0"));
        list.add(new Model("Fffefwgff", "bbbbnbbb", "0"));
        list.add(new Model("Fffefefff", "bbbbnbbb", "0"));

        listView.setAdapter(new ListAdapter(this, list));
    }
}
