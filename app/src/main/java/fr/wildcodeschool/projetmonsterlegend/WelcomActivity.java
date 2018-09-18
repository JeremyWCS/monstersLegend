package fr.wildcodeschool.projetmonsterlegend;

import android.content.Intent;
import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);


        getSupportActionBar().hide();
        Button enterButton = findViewById(R.id.enter_button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToactivity_main = new Intent(WelcomActivity.this,
                        MainActivity.class);
                WelcomActivity.this.startActivity(goToactivity_main);
            }
        });
    }
}
