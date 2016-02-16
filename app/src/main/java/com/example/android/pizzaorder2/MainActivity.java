package com.example.android.pizzaorder2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);small = (Button) findViewById(R.id.smallRadio);
        medium = (Button) findViewById(R.id.medium);
    }

    Button small;
    Button medium;
    double pizzaValue = 7;
    double extrasValue = 0;
    double Total = 0;

    public void selectSmall(View view)
    {
        pizzaValue = 7;
    }

    public void selectMedium(View view)
    {
        pizzaValue = 9;
    }
    public void selectLarge(View view)
    {
        pizzaValue = 13;
    }

    public void calculate(View view)
    {
        Total = pizzaValue + extrasValue;
        Total = Math.round(Total * 100);
        Total /= 100;
        display(Total);
    }
    private void display(double number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.orderTotal);
        quantityTextView.setText("Total is $" + number);
    }



    public void calculate2(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                    extrasValue = extrasValue + 1.75;
                else
                    extrasValue = extrasValue - 1.75;
                break;
            case R.id.checkBox2:
                if (checked)
                    extrasValue = extrasValue + 2.5;
                else
                    extrasValue = extrasValue - 2.5;
                break;



        }

    }


}
