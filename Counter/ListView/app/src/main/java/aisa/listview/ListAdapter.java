package aisa.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 6/6/17.
 */

public class ListAdapter extends ArrayAdapter<Model> {

    public ListAdapter(Context context, List<Model> list){
        super(context, 0, list);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Model m = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_1, parent, false);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            TextView textView2 = (TextView) convertView.findViewById(R.id.textView2);
            TextView textView3 = (TextView) convertView.findViewById(R.id.textView3);


            textView.setText(m.getName());
            textView2.setText(m.getTime());
            textView3.setText(m.getDate());
        }

        return convertView;
    }
}
