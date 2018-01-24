package com.example.andoid.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    //Global
    int numberOfCoffee = 0;
    String thankYou = "\nThank You!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * This incrementQuantity method is called when the order button is clicked.
     */
    public void incrementQuantity(View view) {

        numberOfCoffee++;
        display(numberOfCoffee);
        //displayPrice(numberOfCoffee*5);
    }


    /**
     * This deIncrementQuantitymethod is called when the order button is clicked.
     */
    public void deIncrementQuantity(View view) {

        numberOfCoffee--;
        display(numberOfCoffee);
        //displayPrice(numberOfCoffee*5);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = "Free";
        displayMessage(priceMessage);
        display(numberOfCoffee);
        displayPrice(numberOfCoffee*5);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("That would be = " + numberOfCoffee + " cups totalling " + number + " or " + NumberFormat.getCurrencyInstance().format(number) + ", please.");
        priceTextView.setText(priceTextView.getText()+thankYou);
    }
}













/*
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/
