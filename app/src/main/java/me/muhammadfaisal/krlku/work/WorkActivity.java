package me.muhammadfaisal.krlku.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import me.muhammadfaisal.krlku.MainActivity;
import me.muhammadfaisal.krlku.R;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        getSupportActionBar().hide();

    }
}
