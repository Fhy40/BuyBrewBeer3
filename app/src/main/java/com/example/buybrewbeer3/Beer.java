package com.example.buybrewbeer3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Beer extends AppCompatActivity {

    int count = 0;
    private Button add_button;
    private Button minus_button;
    private EditText order_amount;
    private ImageView beer_imageview;
    private TextView beer_name_txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        beer_imageview = (ImageView) findViewById(R.id.beer_imageview);
        Bundle bundle = getIntent().getExtras();
        Integer image_url = bundle.getInt("image_url");
        beer_imageview.setImageResource(image_url);

        beer_name_txtview = (TextView) findViewById(R.id.beer_name_txtview);
        String beer_name = bundle.getString("beer_name");
        beer_name_txtview.setText(beer_name);

        order_amount = findViewById(R.id.order_amount);

        add_button = (Button) findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count++;
                order_amount.setText(Integer.toString(count));
            }
        });

        minus_button = (Button) findViewById(R.id.minus_button);
        minus_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count--;
                order_amount.setText(Integer.toString(count));

            }
        });



    }
}
