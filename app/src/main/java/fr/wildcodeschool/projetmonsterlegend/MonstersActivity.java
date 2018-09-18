package fr.wildcodeschool.projetmonsterlegend;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MonstersActivity extends AppCompatActivity {


    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters);
        Intent intent = getIntent();
        int iMon = intent.getIntExtra("indexMonster",0);

        ArrayList<Monster> monsters=
                new ArrayList<>();

        monsters.add(new Monster(
                Color.rgb(255, 153, 0),
                Color.rgb(255, 224, 179),
                "Fire Lion",
                R.drawable.fire_lion_0,
                R.drawable.fire_lion_1,
                R.drawable.fire_lion_2,
                R.drawable.fire_lion_3,
                "Possessing a mane of white-hot hell fire and more than just a sting in his tail – the Fire Lion is a creature of mythic awesomeness! The Fire Lion will make fast work of anyone foolish enough to challenge him.",
                R.drawable.bte_fire,
                new String[]{"Surchauffe","Feu Orange","Fourrure Fondate","Griffes Incandescentes","Gazs Enflammés","Peau Eruptive","Feu de Forêt","Lava Trempette","Rayon Solaire Hyper Concentré de la Mort"}
        ));

        monsters.add(new Monster(
                Color.rgb(140, 26, 255),
                Color.rgb(204, 204, 255),
                "Genie",
                R.drawable.genie_0,
                R.drawable.genie_1,
                R.drawable.genie_2,
                R.drawable.genie_3,
                "Formed from bright, hot-blue fire and able to travel great distances in the blink of an eye. Think twice before entering into any kind of agreement with these magical marvels.",
                R.drawable.bte_magic,
                new String[]{"Attaque Rapide","Coup Etourdi","Rayon Prismatique","Orbe des Arcanes","Surcharge","Attaque Inventée","Fissure des Membres","Nourrir","Magneto"}

        ));

        monsters.add(new Monster(
                Color.rgb(255, 179, 255),
                Color.rgb(255, 255, 230),
                "Light Spirit",
                R.drawable.light_spirit_0,
                R.drawable.light_spirit_1,
                R.drawable.light_spirit_2,
                R.drawable.light_spirit_3,
                "These lighthearted pixie creatures spend most of their time unseen. On account of how they are made from light - they often get mistaken for mirages, yet here they are, right on your island!",
                R.drawable.bte_light,
                new String[]{"Piques de Lumière","Coup Herbe","Soin","Frappe Etourdissante","Bouclier","Consecration","Fissure des Membres","Soin Massif","Poings Vampire"}
        ));

        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, monsters.get(iMon));

        viewPager.setAdapter(viewPagerAdapter);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setLogo(R.drawable.monsterlegends_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



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
        final TextView skill1 = findViewById(R.id.skill1);
        final TextView skill2 = findViewById(R.id.skill2);
        final TextView skill3 = findViewById(R.id.skill3);
        final android.support.constraint.Group groupSkills = findViewById(R.id.groupSkills);
        final TextView monsterName = findViewById(R.id.text_name);
        final ImageView type = findViewById(R.id.image_type);
        final ImageView atq1 = findViewById(R.id.imageView5);
        final ImageView atq2 = findViewById(R.id.imageView6);
        final ImageView atq3 = findViewById(R.id.imageView7);
        final ImageView atq4 = findViewById(R.id.imageView8);
        final ImageView atq5 = findViewById(R.id.imageView9);
        final ImageView atq6 = findViewById(R.id.imageView10);
        final ImageView atq7 = findViewById(R.id.imageView11);
        final ImageView atq8 = findViewById(R.id.imageView12);
        final ImageView atq9 = findViewById(R.id.imageView13);
        final TextView textAtq1 = findViewById(R.id.textView9);
        final TextView textAtq2 = findViewById(R.id.textView10);
        final TextView textAtq3 = findViewById(R.id.textView11);
        final TextView textAtq4 = findViewById(R.id.textView12);
        final TextView textAtq5 = findViewById(R.id.textView13);
        final TextView textAtq6 = findViewById(R.id.textView14);
        final TextView textAtq7 = findViewById(R.id.textView15);
        final TextView textAtq8 = findViewById(R.id.textView16);
        final TextView textAtq9 = findViewById(R.id.textView17);
        final ScrollView scrollView = findViewById(R.id.scrollView);
        final ConstraintLayout corps = findViewById(R.id.constraintLayout);


        monsterName.setText(monsters.get(iMon).getMonster_name());
        monsterName.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        infoText.setText(monsters.get(iMon).getMonster_info());
        imageN0.setImageResource(monsters.get(iMon).getMonster_pics_0());
        imageN1.setImageResource(monsters.get(iMon).getMonster_pics_1());
        imageN2.setImageResource(monsters.get(iMon).getMonster_pics_2());
        imageN3.setImageResource(monsters.get(iMon).getMonster_pics_3());
        type.setImageResource(monsters.get(iMon).getType());
        atq1.setImageResource(monsters.get(iMon).getType());
        atq2.setImageResource(monsters.get(iMon).getType());
        atq3.setImageResource(monsters.get(iMon).getType());
        atq4.setImageResource(monsters.get(iMon).getType());
        atq5.setImageResource(monsters.get(iMon).getType());
        atq6.setImageResource(monsters.get(iMon).getType());
        atq7.setImageResource(monsters.get(iMon).getType());
        atq8.setImageResource(monsters.get(iMon).getType());
        atq9.setImageResource(monsters.get(iMon).getType());
        infoMonster.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        skills.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        stat.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        skill1.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        skill2.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        skill3.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        scrollView.setBackgroundColor(monsters.get(iMon).getSecondaryColor());
        corps.setBackgroundColor(monsters.get(iMon).getSecondaryColor());
        btnLvl.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        textAtq1.setText(monsters.get(iMon).getAttaques()[0]);
        textAtq2.setText(monsters.get(iMon).getAttaques()[1]);
        textAtq3.setText(monsters.get(iMon).getAttaques()[2]);
        textAtq4.setText(monsters.get(iMon).getAttaques()[3]);
        textAtq5.setText(monsters.get(iMon).getAttaques()[4]);
        textAtq6.setText(monsters.get(iMon).getAttaques()[5]);
        textAtq7.setText(monsters.get(iMon).getAttaques()[6]);
        textAtq8.setText(monsters.get(iMon).getAttaques()[7]);
        textAtq9.setText(monsters.get(iMon).getAttaques()[8]);



        //les variables statistiques
        final int stamina=100;
        final int[] force = {220};
        final int[] speed = {175};
        final int[] life = {50};

        staminaBar.setMax(200);
        forceBar.setMax(2000);
        speedBar.setMax(1700);
        lifeBar.setMax(8000);

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

        //listener sur le changement de page
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //change kes niveaux en fonction de l'évolution selectionnée
            @Override
            public void onPageSelected(int position) {
                int item = viewPager.getCurrentItem();
                if (item==0) editLevel.setText("0");
                else if (item==1) editLevel.setText("1");
                else if (item==2) editLevel.setText("10");
                else  editLevel.setText("20");

                btnLvl.performClick();

            }

            //en fonction du changement d'état du scroll, ça modifie les images dessous (saturation)
            @Override
            public void onPageScrollStateChanged(int state) {
                int item = viewPager.getCurrentItem();
                if (item==0) {
                    imageN0.setColorFilter(0);
                    imageN1.setColorFilter(filter);
                    imageN2.setColorFilter(filter);
                    imageN3.setColorFilter(filter);
                }
                else if (item==1) {
                    imageN0.setColorFilter(filter);
                    imageN1.setColorFilter(0);
                    imageN2.setColorFilter(filter);
                    imageN3.setColorFilter(filter);}
                else if (item==2) {
                    imageN0.setColorFilter(filter);
                    imageN1.setColorFilter(filter);
                    imageN2.setColorFilter(0);
                    imageN3.setColorFilter(filter);
                }
                else  {
                    imageN0.setColorFilter(filter);
                    imageN1.setColorFilter(filter);
                    imageN2.setColorFilter(filter);
                    imageN3.setColorFilter(0);
                }



            }
        });


        imageN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
                editLevel.setText("0");
                btnLvl.performClick();
            }
        });

        imageN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPager.setCurrentItem(1);
                editLevel.setText("1");
                btnLvl.performClick();
            }
        });

        imageN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
                editLevel.setText("10");
                btnLvl.performClick();
            }
        });

        imageN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
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

                if (levelInt ==0) {
                    viewPager.setCurrentItem(0);
                    editLevel.setText(Integer.toString(levelInt));

                }

                if (levelInt >= 1 && levelInt <= 9) {
                    viewPager.setCurrentItem(1);
                    editLevel.setText(Integer.toString(levelInt));

                }

                if (levelInt >= 10 && levelInt <= 19) {
                    viewPager.setCurrentItem(2);
                    editLevel.setText(Integer.toString(levelInt));

                }

                if (levelInt >= 20 && levelInt <= 70) {
                    viewPager.setCurrentItem(3);
                    editLevel.setText(Integer.toString(levelInt));

                }
            //en cas de non renseignement ou de valeurs négatives

                int lvlInt = Integer.valueOf(levelValue);
                //si on passe au dessus du lvl max du monstre on le ramène a son level max

                if (lvlInt > 70) {
                    editLevel.setText("70");
                    lvlInt = 70;
                }

                //calcul des stats
                force[0] = 22 * lvlInt + 220;
                speed[0] = 17 * lvlInt + 50;
                life[0] = 105 * lvlInt + 50;
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
