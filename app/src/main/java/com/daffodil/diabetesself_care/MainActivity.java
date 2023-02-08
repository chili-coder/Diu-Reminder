package com.daffodil.diabetesself_care;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.daffodil.diabetesself_care.diet.DietActivity;

public class MainActivity extends AppCompatActivity {

    private CardView dietCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dietCard=findViewById(R.id.diet_card);

        dietCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DietActivity.class));
            }
        });
    }
}