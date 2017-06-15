package aisa.draftoflistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 6/8/17.
 */

public class ListAdapter extends ArrayAdapter <Model>
{
    public ListAdapter (Context context, List<Model> list)
    {
        super(context, 0, list);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Model m = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);

            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            TextView textView2 = (TextView) convertView.findViewById(R.id.textView2);
            TextClock textClock = (TextClock) convertView.findViewById(R.id.textClock);

            textClock.setText(m.getDate());
            textView.setText(m.getName());
            textView2.setText(m.getMessage());

        }


        return convertView;
    }


}
