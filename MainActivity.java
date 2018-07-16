package com.example.mms00413.testgradle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int cupsOfCoffee = 0;
    int pricePerCup = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
//        display(++cupsOfCoffee);
        displayPrice(cupsOfCoffee, pricePerCup);
    }

    private void displayPrice(int cupsOfCoffee, int pricePerCup) {
        TextView price = findViewById(R.id.price);
        price.setText(NumberFormat.getCurrencyInstance().format(cupsOfCoffee * pricePerCup));
    }

    private void display(int number) {
        TextView quantity = findViewById(R.id.cups_of_coffee);
        quantity.setText(String.valueOf(cupsOfCoffee));

    }

    public void decrease(View view) {
        if(cupsOfCoffee > 0){
            --cupsOfCoffee;
            TextView cups = findViewById(R.id.cups_of_coffee);
            cups.setText(String.valueOf(cupsOfCoffee));
        }

    }

    public void increase(View view) {
        ++cupsOfCoffee;
        TextView cups = findViewById(R.id.cups_of_coffee);
        cups.setText(String.valueOf(cupsOfCoffee));
    }
}
