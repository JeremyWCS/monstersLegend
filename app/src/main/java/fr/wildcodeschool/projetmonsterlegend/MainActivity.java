package fr.wildcodeschool.projetmonsterlegend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
///////////////////////////////////////////////////////////////////////////////////////:
        Button buttonPage = findViewById(R.id.button_main);
        Button buttonRomain = findViewById(R.id.Romain);
        final Intent expandedPage = new Intent(MainActivity.this, MonsterExpandedActivity.class);
        final Intent RomainPage = new Intent(MainActivity.this, MonstersActivity.class);

        buttonPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(expandedPage);
            }

        });

        buttonRomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(RomainPage);
            }

        });
    }
}
