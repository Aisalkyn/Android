package io.futurestud.retrofit1.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import io.futurestud.retrofit1.R;
import io.futurestud.retrofit1.api.model.WeatherForecast;
import io.futurestud.retrofit1.api.service.GitHubClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("http://samples.openweathermap.org")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        GitHubClient client = retrofit.create(GitHubClient.class);

        Call<WeatherForecast> call = client.reposForUser();


        call.enqueue(new Callback<WeatherForecast>() {
            @Override
            public void onResponse(Call<WeatherForecast> call, Response<WeatherForecast> response) {

                WeatherForecast  repos = response.body();

                ((TextView)findViewById(R.id.lon)).setText(String.valueOf(repos.getCoord().getLon()));
                ((TextView)findViewById(R.id.lat)).setText(String.valueOf(repos.getCoord().getLat()));
                ((TextView)findViewById(R.id.id)).setText(String.valueOf(repos.getWeather()[0].getId()));
                ((TextView)findViewById(R.id.main)).setText(String.valueOf(repos.getWeather()[0].getMain()));
                ((TextView)findViewById(R.id.descr)).setText(String.valueOf(repos.getWeather()[0].getDescription()));
                ((TextView)findViewById(R.id.icon)).setText(String.valueOf(repos.getWeather()[0].getIcon()));
                ((TextView)findViewById(R.id.base)).setText(String.valueOf(repos.getBase()));
                ((TextView)findViewById(R.id.temp)).setText(String.valueOf(repos.getMain().getTemp()));
                ((TextView)findViewById(R.id.pressure)).setText(String.valueOf(repos.getMain().getPressure()));
                ((TextView)findViewById(R.id.humidity)).setText(String.valueOf(repos.getMain().getHumidity()));
                ((TextView)findViewById(R.id.temp_min)).setText(String.valueOf(repos.getMain().getTemp_min()));
                ((TextView)findViewById(R.id.temp_max)).setText(String.valueOf(repos.getMain().getTemp_max()));
                ((TextView)findViewById(R.id.visibility)).setText(String.valueOf(repos.getVisibility()));
                ((TextView)findViewById(R.id.speed)).setText(String.valueOf(repos.getWind().getSpeed()));
                ((TextView)findViewById(R.id.deg)).setText(String.valueOf(repos.getWind().getDeg()));
                ((TextView)findViewById(R.id.all)).setText(String.valueOf(repos.getClouds().getAll()));
                ((TextView)findViewById(R.id.dt)).setText(String.valueOf(repos.getDt()));
                ((TextView)findViewById(R.id.type)).setText(String.valueOf(repos.getSys().getType()));
                ((TextView)findViewById(R.id.id2)).setText(String.valueOf(repos.getSys().getId()));
                ((TextView)findViewById(R.id.message)).setText(String.valueOf(repos.getSys().getMessage()));
                ((TextView)findViewById(R.id.country)).setText(String.valueOf(repos.getSys().getCountry()));
                ((TextView)findViewById(R.id.sunrise)).setText(String.valueOf(repos.getSys().getSunrise()));
                ((TextView)findViewById(R.id.sunset)).setText(String.valueOf(repos.getSys().getSunset()));
                ((TextView)findViewById(R.id.id1)).setText(String.valueOf(repos.getId()));
                ((TextView)findViewById(R.id.name)).setText(String.valueOf(repos.getName()));
                ((TextView)findViewById(R.id.cod)).setText(String.valueOf(repos.getCod()));


            }


            @Override
            public void onFailure(Call<WeatherForecast> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error :(", Toast.LENGTH_SHORT).show();

            }


        });
    }

}
