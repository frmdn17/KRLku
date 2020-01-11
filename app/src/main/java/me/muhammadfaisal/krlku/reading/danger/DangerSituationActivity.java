package me.muhammadfaisal.krlku.reading.danger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.muhammadfaisal.krlku.R;

public class DangerSituationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danger_situation);

        getSupportActionBar().hide();
    }
}
