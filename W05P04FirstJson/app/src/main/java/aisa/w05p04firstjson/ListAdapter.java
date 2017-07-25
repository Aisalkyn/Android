package aisa.w05p04firstjson;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 7/5/17.
 */

public class ListAdapter extends ArrayAdapter<Model> {

    public ListAdapter(Context context, List<Model> list)
    {
        super(context, 0, list);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Model m = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);


            TextView tvLon = (TextView) convertView.findViewById(R.id.lon);
            TextView tvLat = (TextView) convertView.findViewById(R.id.lat);
            TextView tvId = (TextView) convertView.findViewById(R.id.id);
            TextView tvMain = (TextView) convertView.findViewById(R.id.main);
            TextView tvDescription = (TextView) convertView.findViewById(R.id.descr);
            TextView tvIcon = (TextView) convertView.findViewById(R.id.icon);
            TextView tvBase = (TextView) convertView.findViewById(R.id.base);
            TextView tvTemp = (TextView) convertView.findViewById(R.id.temp);
            TextView tvPressure = (TextView) convertView.findViewById(R.id.pressure);
            TextView tvHumidity = (TextView) convertView.findViewById(R.id.humidity);
            TextView tvTemp_min = (TextView) convertView.findViewById(R.id.temp_min);
            TextView tvTemp_max = (TextView) convertView.findViewById(R.id.temp_max);
            TextView tvVisibility = (TextView) convertView.findViewById(R.id.visibility);
            TextView tvSpeed = (TextView) convertView.findViewById(R.id.speed);
            TextView tvDeg = (TextView) convertView.findViewById(R.id.deg);
            TextView tvAll = (TextView) convertView.findViewById(R.id.all);

            TextView tvType = (TextView) convertView.findViewById(R.id.type);
            TextView tvId2 = (TextView) convertView.findViewById(R.id.id2);
            TextView tvMessage = (TextView) convertView.findViewById(R.id.message);
            TextView tvCountry = (TextView) convertView.findViewById(R.id.country);
            TextView tvSunrise = (TextView) convertView.findViewById(R.id.sunrise);
            TextView tvSunset = (TextView) convertView.findViewById(R.id.sunset);



            TextView tvDt = (TextView) convertView.findViewById(R.id.dt);
            TextView tvId1 = (TextView) convertView.findViewById(R.id.id1);
            TextView tvName = (TextView) convertView.findViewById(R.id.name);
            TextView tvCod = (TextView) convertView.findViewById(R.id.cod);




            tvLon.setText(String.valueOf(m.getLon()));
            tvLat.setText(String.valueOf(m.getLat()));
            tvId.setText(String.valueOf(m.getId()));
            tvMain.setText(String.valueOf(m.getMain()));
            tvDescription.setText(String.valueOf(m.getDescription()));
            tvIcon.setText(String.valueOf(m.getIcon()));
            tvBase.setText(String.valueOf(m.getBase()));
            tvTemp.setText(String.valueOf(m.getTemp()));
            tvPressure.setText(String.valueOf(m.getPressure()));
            tvHumidity.setText(String.valueOf(m.getHumidity()));
            tvTemp_min.setText(String.valueOf(m.getTemp_min()));
            tvTemp_max.setText(String.valueOf(m.getTemp_max()));
            tvVisibility.setText(String.valueOf(m.getVisibility()));
            tvSpeed.setText(String.valueOf(m.getSpeed()));
            tvDeg.setText(String.valueOf(m.getDeg()));
            tvAll.setText(String.valueOf(m.getAll()));
            tvType.setText(String.valueOf(m.getType()));
            tvId2.setText(String.valueOf(m.getId2()));
            tvMessage.setText(String.valueOf(m.getMessage()));
            tvCountry.setText(String.valueOf(m.getCountry()));
            tvSunrise.setText(String.valueOf(m.getSunrise()));
            tvSunset.setText(String.valueOf(m.getSunset()));




            tvDt.setText(String.valueOf(m.getDt()));
            tvId1.setText(String.valueOf(m.getId1()));
            tvName.setText(String.valueOf(m.getName()));
            tvCod.setText(String.valueOf(m.getCod()));

        }

        return convertView;
    }
}

