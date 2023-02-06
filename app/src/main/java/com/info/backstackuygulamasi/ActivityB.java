package com.info.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private Button  buttonCyegit; //tanımlama


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        buttonCyegit=findViewById(R.id.buttonCyegit); //sayfaya bağlama
        buttonCyegit.setOnClickListener(new View.OnClickListener() { //tıklama ozelligi getirme
            @Override
            public void onClick(View view) {

                Intent yeniIntent = new Intent(ActivityB.this, ActivityC.class);
                startActivity(yeniIntent);
            }
        });
    }
}