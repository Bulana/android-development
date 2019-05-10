package com.bulana.plus_minus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView counter;
    private ImageButton plusButton;
    private ImageButton minusButton;
    private int counterNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = (TextView) findViewById(R.id.textView);
        plusButton = (ImageButton) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);
        minusButton = (ImageButton) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.minusButton:
                decrementMainCounter();
                break;
            case R.id.plusButton:
                incrementMainCounter();
                break;
        }
    }


    public void decrementMainCounter() {
            counterNumber--;
            counter.setText(String.valueOf(counterNumber));
    }

    public void incrementMainCounter() {
        counterNumber++;
        counter.setText(String.valueOf(counterNumber));
    }

}
