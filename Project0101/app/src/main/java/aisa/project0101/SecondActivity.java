package aisa.project0101;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 6/12/17.
 */

public class SecondActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secon_activity);

        listView = (ListView) findViewById(R.id.listView);
        List<Content> list = new ArrayList<>();

        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "Sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cella collection of cells that work together to perform similar functions is called a tissue. )", "sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "Sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "Sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "Sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "sources: Wiki", "00201"));
        list.add(new Content("Date", "The cell is the basic unit of a living organism. In multicellular organisms (organisms with more than one cell)", "Sources: Wiki", "00201"));




        listView.setAdapter(new ListAdapter(this, list));
    }

}
