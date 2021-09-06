package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class addReview extends AppCompatActivity {

    Button buttonShow;
    TextView viewResult;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);
        viewResult = findViewById(R.id.viewResult);
        ratingBar = findViewById(R.id.ratingBar);
        buttonShow = findViewById(R.id.submitReview);

        Intent inntent = getIntent();
        String str = inntent.getStringExtra("message_key");

        if(str.equals("image1")) {

        }
        else if(str.equals("image2"))
        {

        }
        else if(str.equals("image3"))
        {

        }
        else if(str.equals("image4"))
        {

        }else if(str.equals("image5"))
        {

        }else if(str.equals("image6"))
        {

        }

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalValue = ratingBar.getNumStars()+"";
                String rating = ratingBar.getRating()+"";
                viewResult.setText("Your rating: "+rating+"*");
            }
        });
    }
}