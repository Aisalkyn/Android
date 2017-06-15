package aisa.listview02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 6/7/17.
 */

public class ListAdapter extends ArrayAdapter <Model> {

    public ListAdapter (Context context, List<Model> list)
    {
        super(context, 0, list);
    }

    public View getView (int position, View convertView, ViewGroup parent)
    {
        Model m = getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);

            TextView textview = (TextView) convertView.findViewById(R.id.textView);
            TextView textview2 = (TextView) convertView.findViewById(R.id.textView2);
            TextClock textClock = (TextClock) convertView.findViewById(R.id.textClock);

            textview.setText(m.getName());
            textview2.setText(m.getMessage());
            textClock.setText(m.getDate());
        }

        return convertView;
    }
}
