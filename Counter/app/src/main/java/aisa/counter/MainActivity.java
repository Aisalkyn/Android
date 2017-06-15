package aisa.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    Button decrementButton;
    Button incrementButton;
    Button cleanButton;
    Button multiplyButton;
    Button inc5button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView3);
        decrementButton = (Button) findViewById(R.id. button1);
        incrementButton = (Button) findViewById(R.id.button2);
        cleanButton = (Button) findViewById(R.id.button9);
        multiplyButton = (Button) findViewById(R.id.button11);
        inc5button = (Button) findViewById(R.id.button12);


        decrementButton.setOnClickListener(Decrement);
        incrementButton.setOnClickListener(Increment);
        cleanButton.setOnClickListener(Clean);
        multiplyButton.setOnClickListener(Inc10);
        inc5button.setOnClickListener(Inc5);


    }
    private View.OnClickListener Decrement = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int num = Integer.parseInt(textView.getText().toString())-1;

            if (num >=0)
            {
                String message = String.format(Locale.getDefault(), "%04d", num);
                textView.setText(message);
            }

            else
            {
                Toast.makeText(getApplicationContext(), "Number cannot be negative",Toast.LENGTH_LONG).show();
            }


        }
    };
    private View.OnClickListener Increment = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int num = Integer.parseInt(textView.getText().toString())+1;

            String message = String.format(Locale.getDefault(), "%04d", num);
            textView.setText(message);

        }
    };

    private View.OnClickListener Clean = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            textView.setText("0000");


        }
    };
    private View.OnClickListener Inc10 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int n = Integer.parseInt(textView.getText().toString())+10;
            String m = String.format(Locale.getDefault(), "%04d", n);
            textView.setText(m);
        }
    };

    private View.OnClickListener Inc5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int n = Integer.parseInt(textView.getText().toString())+5;
            String m = String.format(Locale.getDefault(), "%04d", n);
            textView.setText(m);
        }
    };


}
