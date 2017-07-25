package aisa.w03p03navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 6/23/17.
 */

public class SimpleViewWind extends Fragment {

    public SimpleViewWind() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.simple_wind, container, false);

        return rootView;
    }

}

