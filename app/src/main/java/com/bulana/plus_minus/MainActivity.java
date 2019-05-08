package com.bulana.plus_minus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private ImageButton plusButton;
    private ImageButton minusButton;
    private int counterNumber;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.minusButton:
                    minus();
                    break;
                case R.id.plusButton:
                    plus();
                    break;
            }
        }
    };


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = (TextView) findViewById(R.id.textView);
        plusButton = (ImageButton) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(clickListener);
        minusButton = (ImageButton) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(clickListener);
    }
    public void minus() {
            counterNumber--;
            counter.setText(counterNumber + "");
    }
    public void plus() {
        counterNumber++;
        counter.setText(counterNumber + "");
    }

}
