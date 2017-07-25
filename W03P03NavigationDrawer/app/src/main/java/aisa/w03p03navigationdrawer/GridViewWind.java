package aisa.w03p03navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 6/23/17.
 */

public class GridViewWind extends Fragment {

    public GridViewWind() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.grid_wind, container, false);

        return rootView;
    }

}
