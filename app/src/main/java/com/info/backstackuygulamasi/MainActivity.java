package com.info.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //buton byegiti tanimladim.
    private Button buttonByegit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //butonbyegiti sayfaya baglamam gerekiyor:
        buttonByegit = findViewById(R.id.buttonByegit); //baglama islemini yaptım

        //tiklama islemini yapıyorum:
        buttonByegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //simdi burada intentler ile butona basıldıgında sayfa gecisi yapılması için intentleri yazacagım:

                Intent yeniIntent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(yeniIntent);

            }
        });




    }
}