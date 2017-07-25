package aisa.w05p04firstjson;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private ListView lv;

    ArrayList<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelList = new ArrayList<>();
        lv = (ListView) findViewById(R.id.list);

        new GetContacts().execute();
    }

    private class GetContacts extends AsyncTask<Void, Void, List<Model>> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(MainActivity.this,"Json Data is downloading",Toast.LENGTH_LONG).show();

        }

        @Override
        protected List<Model> doInBackground(Void... voids) {
            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            String url = "http://samples.openweathermap.org/data/2.5/weather?q=London%2Cuk&appid=b1b15e88fa797225412429c1c50c122a1";
            String jsonStr = sh.makeServiceCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                Model model = new Model();
                try {
                    JSONObject object = new JSONObject(jsonStr);
                    JSONObject coord = object.getJSONObject("coord");
                    model.setLon(coord.getDouble("lon"));
                    model.setLat(coord.getDouble("lat"));


                    JSONArray array = object.getJSONArray("weather");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject object1 = array.getJSONObject(i);
                        model.setId(object1.getInt("id"));
                        model.setMain(object1.getString("main"));
                        model.setDescription(object1.getString("description"));
                        model.setIcon(object1.getString("icon"));
                        model.setBase(object.getString("base"));


                        JSONObject main = object.getJSONObject("main");
                        model.setTemp(main.getDouble("temp"));
                        model.setPressure(main.getInt("pressure"));
                        model.setHumidity(main.getInt("humidity"));
                        model.setTemp_min(main.getDouble("temp_min"));
                        model.setTemp_max(main.getDouble("temp_max"));
                        model.setVisibility(object.getInt("visibility"));

                        JSONObject wind = object.getJSONObject("wind");
                        model.setSpeed(wind.getDouble("speed"));
                        model.setDeg(wind.getInt("deg"));

                        JSONObject clouds = object.getJSONObject("clouds");
                        model.setAll(clouds.getInt("all"));
                        model.setDt(object.getLong("dt"));

                        JSONObject sys = object.getJSONObject("sys");
                        model.setType(sys.getInt("type"));
                        model.setId2(sys.getInt("id"));
                        model.setMessage(sys.getDouble("message"));
                        model.setCountry(sys.getString("country"));
                        model.setSunrise(sys.getLong("sunrise"));
                        model.setSunset(sys.getLong("sunset"));
                        model.setId1(object.getInt("id"));
                        model.setName(object.getString("name"));
                        model.setCod(object.getInt("cod"));



                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                modelList.add(model);
            }
            return modelList;
        }


        @Override
        protected void onPostExecute(List<Model> result) {
            super.onPostExecute(result);
            ListAdapter adapter = new aisa.w05p04firstjson.ListAdapter(getApplicationContext(), result);

            lv.setAdapter(adapter);
        }
    }
}