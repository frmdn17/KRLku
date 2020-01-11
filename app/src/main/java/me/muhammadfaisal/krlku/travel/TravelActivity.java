package me.muhammadfaisal.krlku.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import me.muhammadfaisal.krlku.R;
import me.muhammadfaisal.krlku.travel.adapter.TravelAdapter;
import me.muhammadfaisal.krlku.travel.model.Travel;

public class TravelActivity extends AppCompatActivity {

    RecyclerView rvtTravel;
    RecyclerView.LayoutManager layoutManager;
    Context context;
    TravelAdapter travelAdapter;
    private ArrayList<Travel> travels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        getSupportActionBar().hide();

        addData();

        travelAdapter = new TravelAdapter(travels);

        rvtTravel = findViewById(R.id.rvTravel);
        layoutManager = new LinearLayoutManager(TravelActivity.this, RecyclerView.VERTICAL, false);
        rvtTravel.setLayoutManager(layoutManager);
        rvtTravel.setAdapter(travelAdapter);
    }

     void addData() {
        travels = new ArrayList<>();
        travels.add(new Travel("Monas", "DKI Jakarta", "null", 0, 0, R.drawable.ic_email_24dp));
    }
}
