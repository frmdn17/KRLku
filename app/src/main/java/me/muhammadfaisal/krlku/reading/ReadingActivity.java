package me.muhammadfaisal.krlku.reading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.muhammadfaisal.krlku.R;
import me.muhammadfaisal.krlku.reading.danger.DangerSituationActivity;
import me.muhammadfaisal.krlku.reading.history.HistoryActivity;
import me.muhammadfaisal.krlku.reading.office.OfficeActivity;
import me.muhammadfaisal.krlku.reading.type.TypeActivity;

public class ReadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final CardView cardHistory, cardType, cardDanger, cardETicekting, cardRoute, cardOffice;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        getSupportActionBar().hide();

        cardHistory = findViewById(R.id.cardHistory);
        cardType = findViewById(R.id.cardSubwayType);
        cardOffice = findViewById(R.id.cardOffice);
        cardDanger = findViewById(R.id.cardDangerSituation);
        cardRoute = findViewById(R.id.cardRoute);
        cardETicekting = findViewById(R.id.cardETicketing);

        cardOffice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(ReadingActivity.this, OfficeActivity.class);
               startActivity(i);
            }
        });

        cardDanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ReadingActivity.this, DangerSituationActivity.class);
                startActivity(i);
            }
        });

        cardType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ReadingActivity.this, TypeActivity.class);
                startActivity(i);
            }
        });

        cardHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ReadingActivity.this, HistoryActivity.class);
                startActivity(i);
            }
        });
    }
}
