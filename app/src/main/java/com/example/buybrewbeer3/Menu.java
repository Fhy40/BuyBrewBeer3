package com.example.buybrewbeer3;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    private ImageView balter_view;
    private ImageView bentspoke_view;
    private ImageView stonewood_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        balter_view = (ImageView) findViewById(R.id.balter_view);
        balter_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBalter();
            }
        });

        bentspoke_view = (ImageView) findViewById(R.id.bentspoke_view);
        bentspoke_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openBentSpoke();
            }
        });

        stonewood_view = (ImageView) findViewById(R.id.stonewood_view);
        stonewood_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openStoneWood();
            }
        });


    }
    public void openBalter()    {
        Intent intent = new Intent(this, Beer.class);
        intent.putExtra("image_url", R.drawable.balter_xpa);
        intent.putExtra("beer_name", "Balter XPA");
        startActivity(intent);
    }

    public void openBentSpoke()    {
        Intent intent = new Intent(this, Beer.class);
        intent.putExtra("image_url", R.drawable.bent_spoke);
        intent.putExtra("beer_name", "Bent Spoke");
        startActivity(intent);
    }

    public void openStoneWood()    {
        Intent intent = new Intent(this, Beer.class);
        intent.putExtra("image_url", R.drawable.stone_wood_pacific);
        intent.putExtra("beer_name", "Stone Wood Pacific");
        startActivity(intent);
    }
}
