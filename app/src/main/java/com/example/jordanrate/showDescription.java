package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showDescription extends AppCompatActivity {

    ImageView image_view;
    TextView text_view;
    DBHelperRating DB;
    Button buttonAdd;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_description);


        image_view = findViewById(R.id.imageView);
        text_view = findViewById(R.id.DescView);
        buttonAdd = findViewById(R.id.buttonAdd);

        DB=new DBHelperRating(this);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inntent = new Intent(showDescription.this,addReview.class);
                if (str.equals("image1"))
                    inntent.putExtra("message_key", str);
                else if (str.equals("image2"))
                    inntent.putExtra("message_key", str);
                else if (str.equals("image3"))
                    inntent.putExtra("message_key", str);
                else if (str.equals("image4"))
                    inntent.putExtra("message_key", str);
                else if (str.equals("image5"))
                    inntent.putExtra("message_key", str);
                else if (str.equals("image6"))
                    inntent.putExtra("message_key", str);
                startActivity(inntent);
            }
        });

        if(str.equals("image1")) {
            image_view.setBackgroundResource(R.drawable.air2);
            text_view.setText(R.string.air1);
            DB.insertData(1, 0.0F);
        }
        else if(str.equals("image2"))
        {
            image_view.setBackgroundResource(R.drawable.air3);
            text_view.setText(R.string.air2);
            DB.insertData(2, 0.0F);
        }
        else if(str.equals("image3"))
        {
            image_view.setBackgroundResource(R.drawable.air1);
            text_view.setText(R.string.Air_Jordan_13_Retro_1);
            DB.insertData(3, 0.0F);
        }
        else if(str.equals("image4"))
        {
            image_view.setBackgroundResource(R.drawable.air4);
            text_view.setText(R.string.x_Dior_Air_Jordan_1);
            DB.insertData(4, 0.0F);
        }else if(str.equals("image5"))
        {
            image_view.setBackgroundResource(R.drawable.air5);
            text_view.setText(R.string.air5);
            DB.insertData(5, 0.0F);
        }else if(str.equals("image6"))
        {
            image_view.setBackgroundResource(R.drawable.air6);
            text_view.setText(R.string.Air_Jordan_1_Retro);
            DB.insertData(6, 0.0F);
        }
    }

}