package fr.wildcodeschool.projetmonsterlegend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.acl.Group;

public class MonsterExpandedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_expanded);
        ///////////////////////////////////////////////////////////////////:
        final TextView stat = findViewById(R.id.stat);
        final android.support.constraint.Group group = findViewById(R.id.Lion);
        final TextView staminaText = findViewById(R.id.stamina);
        final TextView forceText = findViewById(R.id.power);
        final TextView speedText = findViewById(R.id.speed);
        final TextView lifeText = findViewById(R.id.life);
        final Button ok = findViewById(R.id.buttonOk);
        final TextView level = findViewById(R.id.level);
        final ProgressBar forceBar = findViewById(R.id.powerBar);
        final ProgressBar lifeBar = findViewById(R.id.lifeBar);
        final ProgressBar speedBar = findViewById(R.id.speedBar);
        final ProgressBar staminaBar = findViewById(R.id.staminaBar);

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

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //je récupère mon string et le reconverti en int
                String lvlStr=level.getText().toString();

                //en cas de non renseignement ou de valeurs négatives
                if(lvlStr.isEmpty()) {
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
                    int lvlInt = Integer.valueOf(lvlStr);
                    //si on passe au dessus du lvl max du monstre on le ramène a son level max
                    if (lvlInt > 70) {
                        level.setText("70");
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


    }
}
