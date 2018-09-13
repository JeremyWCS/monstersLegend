package fr.wildcodeschool.projetmonsterlegend;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MonstersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters);


        final ImageView imageN0 = findViewById(R.id.image_n0);
        final ImageView imageN1 = findViewById(R.id.image_n1);
        final ImageView imageN2 = findViewById(R.id.image_n2);
        final ImageView imageN3 = findViewById(R.id.image_n3);

        final EditText editLevel = findViewById(R.id.level);
        final Button btnLvl = findViewById(R.id.buttonOk);

        ///////////////////////////////////////////////////////////////////:
        final TextView stat = findViewById(R.id.stat);
        final android.support.constraint.Group group = findViewById(R.id.Lion);
        final TextView staminaText = findViewById(R.id.stamina);
        final TextView forceText = findViewById(R.id.power);
        final TextView speedText = findViewById(R.id.speed);
        final TextView lifeText = findViewById(R.id.life);
        final ProgressBar forceBar = findViewById(R.id.powerBar);
        final ProgressBar lifeBar = findViewById(R.id.lifeBar);
        final ProgressBar speedBar = findViewById(R.id.speedBar);
        final ProgressBar staminaBar = findViewById(R.id.staminaBar);
        final TextView infoMonster = findViewById(R.id.Autre);
        final TextView infoText = findViewById(R.id.info);
        final TextView skills = findViewById(R.id.skills);
        final android.support.constraint.Group groupSkills = findViewById(R.id.groupSkills);
        //les variables statistiques
        final int stamina=100;
        final int[] force = {142};
        final int[] speed = {24};
        final int[] life = {3};

        staminaBar.setMax(200);
        forceBar.setMax(700+142);
        speedBar.setMax(4*70+24);
        lifeBar.setMax(6*70+3);

        //initialisation a la première execution (pour ne pas attendre une modification pour l'affichage de valeurs)
        lifeText.setText(Integer.toString(life[0]));
        forceText.setText(Integer.toString(force[0]));
        speedText.setText(Integer.toString(speed[0]));
        staminaText.setText(Integer.toString(stamina));
        staminaBar.setProgress(stamina);
        forceBar.setProgress(force[0]);
        speedBar.setProgress(speed[0]);
        lifeBar.setProgress(life[0]);
        group.setVisibility(View.GONE);
        groupSkills.setVisibility(View.GONE);
        infoText.setVisibility(View.GONE);

        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        final ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);

        imageN0.setColorFilter(0);
        imageN1.setColorFilter(filter);
        imageN2.setColorFilter(filter);
        imageN3.setColorFilter(filter);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        imageN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this ,R.drawable.fire_lion_0);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("0");
                btnLvl.performClick();
            }
        });

        imageN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this ,R.drawable.fire_lion_1);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("4");
                btnLvl.performClick();
            }
        });

        imageN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this ,R.drawable.fire_lion_2);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("10");
                btnLvl.performClick();
            }
        });

        imageN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this ,R.drawable.fire_lion_3);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("20");
                btnLvl.performClick();
            }
        });

        btnLvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String levelValue = editLevel.getText().toString();

                if(levelValue.isEmpty()) {
                    Toast niveauNok = Toast.makeText(getApplicationContext(), getString(R.string.toast), Toast.LENGTH_LONG);
                    niveauNok.show();
                    staminaBar.setProgress(0);
                    forceBar.setProgress(0);
                    speedBar.setProgress(0);
                    lifeBar.setProgress(0);
                    lifeText.setText(Integer.toString(0));
                    forceText.setText(Integer.toString(0));
                    speedText.setText(Integer.toString(0));
                    staminaText.setText(Integer.toString(0));

                }

                else {
                int levelInt = Integer.valueOf(levelValue);

                if (levelInt>70){
                    levelInt=70;
                    editLevel.setText("70");
                }

                if (levelInt >= 0 && levelInt <= 3) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this, R.drawable.fire_lion_0);
                    imageCenter.setImageDrawable(drawableCenter);
                    imageN0.setColorFilter(0);
                    imageN1.setColorFilter(filter);
                    imageN2.setColorFilter(filter);
                    imageN3.setColorFilter(filter);

                }

                if (levelInt >= 4 && levelInt <= 9) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this, R.drawable.fire_lion_1);
                    imageCenter.setImageDrawable(drawableCenter);
                    imageN0.setColorFilter(filter);
                    imageN1.setColorFilter(0);
                    imageN2.setColorFilter(filter);
                    imageN3.setColorFilter(filter);
                }

                if (levelInt >= 10 && levelInt <= 19) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this, R.drawable.fire_lion_2);
                    imageCenter.setImageDrawable(drawableCenter);
                    imageN0.setColorFilter(filter);
                    imageN1.setColorFilter(filter);
                    imageN2.setColorFilter(0);
                    imageN3.setColorFilter(filter);
                }

                if (levelInt >= 20 && levelInt <= 70) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MonstersActivity.this, R.drawable.fire_lion_3);
                    imageCenter.setImageDrawable(drawableCenter);
                    imageN0.setColorFilter(filter);
                    imageN1.setColorFilter(filter);
                    imageN2.setColorFilter(filter);
                    imageN3.setColorFilter(0);
                }
            //en cas de non renseignement ou de valeurs négatives

                int lvlInt = Integer.valueOf(levelValue);
                //si on passe au dessus du lvl max du monstre on le ramène a son level max

                if (lvlInt > 70) {
                    editLevel.setText("70");
                    lvlInt = 70;
                }

                //calcul des stats
                force[0] = 10 * lvlInt + 142;
                speed[0] = 4 * lvlInt + 24;
                life[0] = 6 * lvlInt + 3;
                lifeText.setText(Integer.toString(life[0]));
                forceText.setText(Integer.toString(force[0]));
                speedText.setText(Integer.toString(speed[0]));
                staminaText.setText(Integer.toString(stamina));
                staminaBar.setProgress(stamina);
                forceBar.setProgress(force[0]);
                speedBar.setProgress(speed[0]);
                lifeBar.setProgress(life[0]);
            }
            }
        });

        //menu déroulant pour hide/show les stats
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(group.getVisibility()==View.GONE){
                    group.setVisibility(View.VISIBLE);

                }
                else group.setVisibility(View.GONE);

            }
        });

        infoMonster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(infoText.getVisibility()==View.GONE){
                    infoText.setVisibility(View.VISIBLE);

                }
                else infoText.setVisibility(View.GONE);

            }
        });


        skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(groupSkills.getVisibility()==View.GONE){
                    groupSkills.setVisibility(View.VISIBLE);

                }
                else groupSkills.setVisibility(View.GONE);

            }
        });

    }
}
