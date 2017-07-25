package aisa.w05p05retrofitjason;


import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;

    private final String URL ="http://samples.openweathermap.org";
    private final String KEY ="trnsl.1.1.20170628T090157Z.9dcf00fb956522ab.452f2e36484df1a96a6fbd3f69e305b46d9572b8";

    private Gson gson = new GsonBuilder().create();
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(URL)
            .build();


    //https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20170628T090157Z.9dcf00fb956522ab.452f2e36484df1a96a6fbd3f69e305b46d9572b8&text=hello&lang=en-ru
    private Link intf = retrofit.create(Link.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<ColorSpace.Model> call = intf.Translate(KEY, editText.getText().toString(), "en-ru");
                call.enqueue(new Callback<ColorSpace.Model>() {
                    @Override
                    public void onResponse(Response<ColorSpace.Model> response, Retrofit retrofit) {
                        //Log.e("res", response.body().toString());
                        textView.setText(response.body().getText().get(0));
                    }

                    @Override
                    public void onFailure(Throwable t) {
///
                    }
                });

            }
        });

    }
}
