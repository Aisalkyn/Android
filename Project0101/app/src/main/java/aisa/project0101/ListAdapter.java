package aisa.project0101;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 6/12/17.
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


            TextView  textView1= (TextView) convertView.findViewById(R.id.date);

            TextView textView = (TextView) convertView.findViewById(R.id.info);
            TextView textView2 = (TextView) convertView.findViewById(R.id.info2);
            TextView textView3 = (TextView) convertView.findViewById(R.id.info3);



            textView.setText(m.getText());
            textView1.setText(m.getText1());
            textView2.setText(m.getText2());
            textView3.setText(m.getText3());
        }

        return convertView;
    }

}
