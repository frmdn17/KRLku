package me.muhammadfaisal.krlku.reading.type;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import me.muhammadfaisal.krlku.R;

public class DetailTypeActivity extends AppCompatActivity {

    String titleExtra, descriptionExtra, madeByExtra;
    int flagsExtra, imageExtra;
    TextView title, type, description, madeBy;
    ImageView flags, image;
    CardView cardShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        StatusBarUtil.setTransparent(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        getSupportActionBar().hide();
        setContentView(R.layout.activity_detail_type);

        titleExtra = getIntent().getStringExtra("title");
        descriptionExtra = getIntent().getStringExtra("description");
        madeByExtra = getIntent().getStringExtra("madeBy");
        flagsExtra = getIntent().getIntExtra("flag", 0);
        imageExtra = getIntent().getIntExtra("image", 0);

        title = findViewById(R.id.title);
        type = findViewById(R.id.type);
        image = findViewById(R.id.image);
        description = findViewById(R.id.description);
        madeBy = findViewById(R.id.madeBy);
        flags = findViewById(R.id.flag);
        cardShare = findViewById(R.id.cardShare);

        title.setText(titleExtra);
        type.setText(titleExtra);
        flags.setImageResource(flagsExtra);
        description.setText(descriptionExtra);
        madeBy.setText(madeByExtra);
        image.setImageResource(imageExtra);

        cardShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, "Tahukah Kamu Bahwa KRL Tipe " + titleExtra + "\nAdalah "  + descriptionExtra.substring(0, 130) + "...." + "\n\n" + "Baca Lebih Lengkap Di Aplikasi KRL KU  Download Di : \n http://muhammadfaisal.me" );
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
