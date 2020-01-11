package me.muhammadfaisal.krlku.info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.muhammadfaisal.krlku.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().hide();
    }
}
