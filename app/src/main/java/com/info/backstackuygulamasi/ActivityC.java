package com.info.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    private Button buttonDyegit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);


        buttonDyegit = findViewById(R.id.buttonDyegit);
        buttonDyegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(ActivityC.this, ActivityD.class);
                startActivity(yeniIntent);
            }
        });
    }
}