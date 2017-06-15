package aisa.project01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button button;
    ImageView imageViewfb;
    ImageView imageViewvk;
    ImageView imageViewin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.password);
        editText2 = (EditText)findViewById(R.id.login);
        button = (Button) findViewById(R.id.enter);
        imageViewfb = (ImageView) findViewById(R.id.imageView);
        imageViewvk = (ImageView) findViewById(R.id.imageView2);
        imageViewin = (ImageView) findViewById(R.id.imageView3);

        button.setOnClickListener(OnClick);
    }

    private View.OnClickListener OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            finish();
        }
    };
}
