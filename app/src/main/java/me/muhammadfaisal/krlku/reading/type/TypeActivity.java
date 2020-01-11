package me.muhammadfaisal.krlku.reading.type;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import me.muhammadfaisal.krlku.R;
import me.muhammadfaisal.krlku.reading.type.adapter.TypeAdapter;
import me.muhammadfaisal.krlku.reading.type.model.Type;

public class TypeActivity extends AppCompatActivity {

    RecyclerView rvType;
    RecyclerView.LayoutManager layoutManager;
    TypeAdapter typeAdapter;
    private ArrayList<Type> types;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        getSupportActionBar().hide();

        rvType = findViewById(R.id.rvType);

        addData();

        typeAdapter = new TypeAdapter(types);

        layoutManager = new LinearLayoutManager(TypeActivity.this ,RecyclerView.VERTICAL, false);

        rvType.setLayoutManager(layoutManager);

        rvType.setAdapter(typeAdapter);

    }

    void addData() {
        types = new ArrayList<>();
        types.add(new Type("JR East 205", getString(R.string.jr_205_desc),"Jepang", R.drawable.jreastseri205, R.drawable.japan_flag));
        types.add(new Type("JR East 203", getString(R.string.jr203_desc),"Jepang", R.drawable.jreastseri203, R.drawable.japan_flag));
        types.add(new Type("JR East 103", getString(R.string.jr_103_descs),"Jepang", R.drawable.eastseri103, R.drawable.japan_flag));
        types.add(new Type("Tokyu Metro 8500", getString(R.string.tokyu_8500_desc),"Jepang", R.drawable.tokyuseri8500, R.drawable.japan_flag));
        types.add(new Type("Tokyu Metro 8000", getString(R.string.tokyu_8000_desc),"Jepang", R.drawable.tokyuseri8000, R.drawable.japan_flag));
        types.add(new Type("Tokyo Metro Seri 7000", getString(R.string.tokyu_7000_desc),"Jepang", R.drawable.tokyometroseri7000, R.drawable.japan_flag));
        types.add(new Type("Tokyo Metro Seri 6000", getString(R.string.tokyu_6000_desc),"Jepang", R.drawable.tokyometroseri6000, R.drawable.japan_flag));
        types.add(new Type("Tokyu Metro 5000", getString(R.string.tokyo_5000_desc),"Jepang", R.drawable.tokyometroseri5000, R.drawable.japan_flag));
        types.add(new Type("Toyo Rapid 1000", getString(R.string.toyo_1000_desc),"Jepang", R.drawable.toyorapidseri1000, R.drawable.japan_flag));
        types.add(new Type("i9000 KFW", getString(R.string.i9000_kfw_desc),"Indonesia", R.drawable.krlinka, R.drawable.indonesia_flag));
    }
}
