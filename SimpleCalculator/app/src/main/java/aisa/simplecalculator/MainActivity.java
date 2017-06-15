package aisa.simplecalculator;

import android.provider.MediaStore;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    TextView textView;

    private enum btn {
        add, subtract, multiply, divide
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.inpuField);
        editText1 = (EditText)findViewById(R.id.editText5);
        textView = (TextView) findViewById(R.id.textView);



    }


    public void click(View view){
        boolean check = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.add:
                if (check)
                  solve(btn.add);

                break;
            case R.id.subtruct:
                if (check)
                    solve(btn.subtract);
                break;
            case R.id.multiply:
                if (check)
                    solve(btn.multiply);
                break;
            case R.id.divide:
                if (check)
                    solve(btn.divide);
                break;

        }
    }

        private void solve(btn b){
        int n = 0;
        int m = 0;
        try {
            n = Integer.parseInt(editText.getText().toString());
            m = Integer.parseInt(editText1.getText().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
            switch (b){
            case add:
                textView.setText(String.valueOf(n + m));
                break;
                case subtract:
                    textView.setText(String.valueOf(n - m));
                    break;
                case multiply:
                    textView.setText(String.valueOf(n * m));
                    break;
                case divide:
                    textView.setText(String.valueOf(n / m));

                    break;



            }
    }
}
