package fr.wildcodeschool.projetmonsterlegend;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangeAct = findViewById(R.id.btn_changeact);
        btnChangeAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToItSearch = new Intent(MainActivity.this,MonstersActivity.class);
                MainActivity.this.startActivity(goToItSearch);
            }
        });


        }
}
