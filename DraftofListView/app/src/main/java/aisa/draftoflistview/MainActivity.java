package aisa.draftoflistview;

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

        listView = (ListView)findViewById(R.id.listView);
        List<Model> list = new ArrayList<>();
        list.add(new Model("AAA", "jdhdhdhd","0"));
        listView.setAdapter(new ListAdapter(this, list));
    }
}
