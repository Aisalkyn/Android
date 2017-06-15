package aisa.projectgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by admin on 6/14/17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        Button btn;

        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.activity_main, null);

            btn = (Button)grid.findViewById(R.id.button) ;

            ImageView imageView = (ImageView)grid.findViewById(R.id.SingleView);

            imageView.setImageResource(mThumbIds[position]);
        }
        else {

            grid = (View) convertView;
        }

        return grid;
    }

// Keep all Images in array
public Integer[] mThumbIds =
        {
        R.drawable.blue_1, R.drawable.fast_1,
        R.drawable.both_2, R.drawable.images,
        R.drawable.fast_1, R.drawable.both_2,
        R.drawable.brown_1, R.drawable.fast_1,
        R.drawable.images, R.drawable.both_2,
        R.drawable.blue_1, R.drawable.blue_1,
        R.drawable.brown_1, R.drawable.images,
};
}
