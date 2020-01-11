package me.muhammadfaisal.krlku.reading.office;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.muhammadfaisal.krlku.R;

public class OfficeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        getSupportActionBar().hide();
    }
}
