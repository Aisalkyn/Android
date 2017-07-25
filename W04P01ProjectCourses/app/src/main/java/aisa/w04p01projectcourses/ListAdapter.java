package aisa.w04p01projectcourses;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 6/27/17.
 */

public class ListAdapter extends ArrayAdapter <Content>
{
    public ListAdapter (Context context, List<Content> list)
    {
        super(context, 0, list);
    }

    public View getView (int position, View convertView, ViewGroup parent)
    {
        Content m = (Content) getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);


            TextView textView = (TextView) convertView.findViewById(R.id.info);




            textView.setText(m.getText());
        }

        return convertView;
    }

}
