package aisa.greet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button3);
        editText = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView3);
        button.setOnClickListener(OnClick);



    }
    private View.OnClickListener OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            textView.setText("Hello, "+ editText.getText());
        }
    };
}
