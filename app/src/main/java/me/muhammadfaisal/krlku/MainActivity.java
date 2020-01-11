package me.muhammadfaisal.krlku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.muhammadfaisal.krlku.info.AboutActivity;
import me.muhammadfaisal.krlku.reading.ReadingActivity;
import me.muhammadfaisal.krlku.travel.TravelActivity;
import me.muhammadfaisal.krlku.work.WorkActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardTravelling,cardWokring,cardReading,cardAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        cardReading = findViewById(R.id.cardReading);
        cardAbout = findViewById(R.id.cardAbout);
        cardTravelling = findViewById(R.id.cardTravelling);
        cardWokring = findViewById(R.id.cardWorking);

        cardReading.setOnClickListener(this);
        cardAbout.setOnClickListener(this);
        cardTravelling.setOnClickListener(this);
        cardWokring.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == cardReading){
            cardReadingMethod();
        }
        if (view == cardAbout){
            cardAboutMethod();
        }
        if (view == cardTravelling){
            cardTravellingMethod();
        }
        if (view == cardWokring){
            cardWokringMethod();
        }
    }

    private void cardWokringMethod() {
        Intent i = new Intent(MainActivity.this, WorkActivity.class);
        startActivity(i);
    }

    private void cardTravellingMethod() {
        Intent i = new Intent(MainActivity.this, TravelActivity.class);
        startActivity(i);
    }

    private void cardAboutMethod() {
        Intent i = new Intent(MainActivity.this , AboutActivity.class);
        startActivity(i);
    }

    private void cardReadingMethod() {
        Intent i = new Intent(MainActivity.this, ReadingActivity.class);
        startActivity(i);
    }
}
