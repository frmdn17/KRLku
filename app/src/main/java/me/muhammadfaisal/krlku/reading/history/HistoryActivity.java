package me.muhammadfaisal.krlku.reading.history;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.muhammadfaisal.krlku.R;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().hide();
    }
}
