package com.info.backstackuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent yeniIntent = new Intent(ActivityD.this, ActivityB.class); //ben d deyim sen B ye git
        yeniIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //yani en sonda kalan backstagi sil ki b den sonra c ye değil a ya geçiş yapsın.
        startActivity(yeniIntent);
    }
}