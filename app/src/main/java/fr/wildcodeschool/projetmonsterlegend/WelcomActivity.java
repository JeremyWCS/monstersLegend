package fr.wildcodeschool.projetmonsterlegend;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);



        final MediaPlayer soundMonster = MediaPlayer.create(this,R.raw.soundmonster);
        //variables des sons.

        soundMonster.start();


        getSupportActionBar().hide();
        Button enterButton = findViewById(R.id.enter_button);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundMonster.stop();//fin du son intro quand bouton actionné

                Intent goToactivity_main = new Intent(WelcomActivity.this,
                        MainActivity.class);
                WelcomActivity.this.startActivity(goToactivity_main);

<<<<<<< HEAD
=======

>>>>>>> b224159601b489836937f4088d30c06a786c6f2f
            }
        });
    }
}
