package aisa.projecttife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 6/16/17.
 */

public class ListAdapter2 extends ArrayAdapter<Model2> {

    public ListAdapter2 (Context context, List<Model2> list)
    {
        super(context, 0, list);
    }

    public View getView (int position, View convertView, ViewGroup parent)
    {
        Model2 m = getItem(position);

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell2, parent, false);


            TextView textView1 = (TextView) convertView.findViewById(R.id.textView3);
            ImageView imageView1 = (ImageView) convertView.findViewById(R.id.imageView2);


            textView1.setText(m.getText1());
            imageView1.setImageResource(m.getImage1());

        }

        return convertView;
    }

}