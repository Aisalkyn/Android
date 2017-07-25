package aisa.w05p02retrofittransalte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

  public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;

    private final String URL ="https://translate.yandex.net";
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
                        Call<Model> call = intf.Translate(KEY, editText.getText().toString(), "en-ru");
                        call.enqueue(new Callback<Model>() {
                            @Override
                            public void onResponse(Response<Model> response, Retrofit retrofit) {
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
