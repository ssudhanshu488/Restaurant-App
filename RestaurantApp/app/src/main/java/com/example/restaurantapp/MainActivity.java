package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CardView starters;
    CardView mainscourse;
    Button click;
    CardView deserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starters = findViewById(R.id.card_view_starters);
        mainscourse = findViewById(R.id.card_view_mains);
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent starterActivityIntent = new Intent(MainActivity.this,StartersActivity.class);
                startActivity(starterActivityIntent);
            }
        });

        mainscourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainCourseActivity = new Intent(MainActivity.this,MainCoursesActivity.class);
                startActivity(MainCourseActivity);
            }
        });

         click = findViewById(R.id.button_clickonme);
         click.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Uri webpage = Uri.parse("https://www.google.com/");
                 Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                     startActivity(intent);

             }
         });
         deserts = findViewById(R.id.card_view_deserts);
         deserts.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent DesertActivity = new Intent(MainActivity.this, DesertActivity.class);
                 startActivity(DesertActivity);

             }
         });


    }
}
