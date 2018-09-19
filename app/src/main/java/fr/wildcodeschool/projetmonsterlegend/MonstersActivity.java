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
        final int iMon = intent.getIntExtra("indexMonster",0);

        getSupportActionBar().hide();

        final ArrayList<Monster> monsters=
                new ArrayList<>();

        monsters.add(new Monster(
                Color.rgb(255, 153, 0),
                Color.rgb(255, 224, 179),
                "Fire Lion",
                R.drawable.fire_lion_0,
                R.drawable.fire_lion_1,
                R.drawable.fire_lion_2,
                R.drawable.fire_lion_3,
                R.drawable.fire_habitat_8,
                "Possessing a mane of white-hot hell fire and more than just a sting in his tail – the Fire Lion is a creature of mythic awesomeness! The Fire Lion will make fast work of anyone foolish enough to challenge him.",
                R.drawable.bte_fire,
                new String[]{"Surchauffe","Feu Orange","Fourrure Fondate","Griffes Incandescentes","Gazs Enflammés","Peau Eruptive","Feu de Forêt","Lava Trempette","Rayon Solaire Hyper Concentré de la Mort"},
                0,
                22,
                17,
                177,
                100,
                220,
                170,
                50,
                new int[]{R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire,R.drawable.bte_fire}
                ));

        monsters.add(new Monster(
                Color.rgb(140, 26, 255),
                Color.rgb(204, 204, 255),
                "Genie",
                R.drawable.genie_0,
                R.drawable.genie_1,
                R.drawable.genie_2,
                R.drawable.genie_3,
                R.drawable.magic_habitat_8,
                "Formed from bright, hot-blue fire and able to travel great distances in the blink of an eye. Think twice before entering into any kind of agreement with these magical marvels.",
                R.drawable.bte_magic,
                new String[]{"Attaque Rapide","Coup Etourdi","Rayon Prismatique","Orbe des Arcanes","Surcharge","Attaque Inventée","Fissure des Membres","Nourrir","Magneto"},
                0,
                19,
                25,
                105,
                100,
                190,
                250,
                50,
        new int[]{R.drawable.bte_any,R.drawable.bte_any,R.drawable.bte_magic,R.drawable.bte_magic,R.drawable.bte_magic,R.drawable.bte_any,R.drawable.bte_any,R.drawable.bte_nature,R.drawable.bte_magic}

        ));

        monsters.add(new Monster(
                Color.rgb(255, 179, 255),
                Color.rgb(255, 255, 230),
                "Light Spirit",
                R.drawable.light_spirit_0,
                R.drawable.light_spirit_1,
                R.drawable.light_spirit_2,
                R.drawable.light_spirit_3,
                R.drawable.light_habitat_8,
                "These lighthearted pixie creatures spend most of their time unseen. On account of how they are made from light - they often get mistaken for mirages, yet here they are, right on your island!",
                R.drawable.bte_light,
                new String[]{"Piques de Lumière","Coup Herbe","Soin","Frappe Etourdissante","Bouclier","Consecration","Fissure des Membres","Soin Massif","Poings Vampire"},
                0,
                17,
                17,
                149,
                100,
                175,
                175,
                71,
                new int[]{R.drawable.bte_light,R.drawable.bte_nature,R.drawable.bte_light,R.drawable.bte_any,R.drawable.bte_any,R.drawable.bte_light,R.drawable.bte_any,R.drawable.bte_light,R.drawable.bte_any}

        ));

        monsters.add(new Monster(
                Color.rgb(135, 135, 135),
                Color.rgb(230, 230, 230),
                "Metalsaur",
                R.drawable.metalsaur_0,
                R.drawable.metalsaur_1,
                R.drawable.metalsaur_2,
                R.drawable.metalsaur_3,
                R.drawable.metal_habitat_8,
                "Metal monsters are tough, hard to beat and dazzling. Metalsaur is pure metal, common but deadly. And now with him, a new age of breeding has started! The new Metal element is here!",
                R.drawable.bte_metal,
                new String[]{"Charge de Minerai","Violence","Frappe de Fer","Baiser Titane","Compact-Beta","Masse Grandiose","Force Acier","Adamantine-Beta","Masse Divine"},
                0,
                22,
                20,
                126,
                100,
                224,
                200,
                60,
                new int[]{R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal,R.drawable.bte_metal}

        ));

        monsters.add(new Monster(
                Color.rgb(155, 88, 0),
                Color.rgb(205, 255, 204),
                "Panda",
                R.drawable.panda_0,
                R.drawable.panda_1,
                R.drawable.panda_2,
                R.drawable.panda_3,
                R.drawable.nature_habitat_8,
                "The Panda, long a symbol of melancholy and sadness, but no longer! These Pandas are Nature's ninjas! What they lack in stealth, they more than make up for in unexpected agility, reflexes and... clumsiness.",
                R.drawable.bte_nature,
                new String[]{"Pollen Allergisant","Pause Rafraichissante","Traitement","Poing Organique","Photosynthèse","Troupeau d'Oiseaux en Colère","Biomasse","Ailes Balsamiques","Force de la Nature"},
                0,
                19,
                20,
                118,
                100,
                190,
                200,
                56,
                new int[]{R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature,R.drawable.bte_nature}

        ));

        monsters.add(new Monster(
                Color.rgb(155, 114, 0),
                Color.rgb(255, 213, 96),
                "Rockilla",
                R.drawable.rockilla_0a,
                R.drawable.rockilla_1a,
                R.drawable.rockilla_2a,
                R.drawable.rockilla_3a,
                R.drawable.earth_habitat_8,
"These hardened souls roam the earthy plains in search of their tail. They live by a strict code favoring loyalty over all else; any who challenge this are reduced to dust by a swift blow from their gargantuan fists.",
                R.drawable.bte_earth,
                new String[]{"Osselets Lourds","Baffe de Boue","Bloc de Pierre","Bâton de Pierre","Dix Tonnes de Sable","Volonté de la Terre","Baffe de Roche","Rockorite","Protection du Maitre King Kong"},
                0,
                17,
                17,
                149,
                100,
                175,
                175,
                71,
                new int[]{R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth,R.drawable.bte_earth}

        ));

        monsters.add(new Monster(
                Color.rgb(239, 242, 53),
                Color.rgb(142, 255, 240),
                "Thunder Eagle",
                R.drawable.thunder_eagle_0,
                R.drawable.thunder_eagle_1,
                R.drawable.thunder_eagle_2,
                R.drawable.thunder_eagle_3,
                R.drawable.thunder_habitat_8,
                "The Bringer of Storms, a once-loyal servant to the Gods of Thunder, transformed into Thunder Eagle form after a terrible betrayal. This sparky creature offers the perfect mix of grace and danger.",
                R.drawable.bte_thunder,
                new String[]{"Attaque Rapide","Charge Blitzer","Vif Eclair","Fissure de Membres","Faisceau d'Allumage","Orage","Marteau de Thor","Bouclier","Dieu de la Foudre"},
                0,
                17,
                25,
                105,
                100,
                175,
                250,
                50,
                new int[]{R.drawable.bte_any,R.drawable.bte_any,R.drawable.bte_thunder,R.drawable.bte_any,R.drawable.bte_thunder,R.drawable.bte_thunder,R.drawable.bte_thunder,R.drawable.bte_any,R.drawable.bte_thunder}

        ));

        monsters.add(new Monster(
                Color.rgb(0, 113, 155),
                Color.rgb(196, 239, 255),
                "Turtle",
                R.drawable.turtle_0,
                R.drawable.turtle_1,
                R.drawable.turtle_2,
                R.drawable.turtle_3,
                R.drawable.water_habitat_8,
                "Shy and unassuming, this tricky creature is master of the water realm and sharper than shattered glass. The Water Turtle may be slow on land, but he’s as dangerous as he is graceful in the ocean.",
                R.drawable.bte_water,
                new String[]{"Fissure de membres","Tourbillon Nettoyant","Attaque Eau","Frappe Superbe","Frappe destabilisante","Attaque Eau","Rigidité Interne","Tsunami","Ouragan"},
                0,
                20,
                20,
                118,
                100,
                200,
                200,
                56,
                new int[]{R.drawable.bte_any,R.drawable.bte_water,R.drawable.bte_water,R.drawable.bte_any,R.drawable.bte_any,R.drawable.bte_water,R.drawable.bte_any,R.drawable.bte_water,R.drawable.bte_water}

        ));

        monsters.add(new Monster(
                Color.rgb(135, 135, 135),
                Color.rgb(226, 228, 255),
                "Tyrannoking",
                R.drawable.tyrannoking_0,
                R.drawable.tyrannoking_1,
                R.drawable.tyrannoking_2,
                R.drawable.tyrannoking_3,
                R.drawable.dark_habitat_8,
"Hail to the king baby! Self-proclaimed Kings of the Lizards, these dark creatures offer the perfect mix of danger, mystery and coolness to any island. Just don’t mention their short arms... these tyrants have got a bite!",
                R.drawable.bte_dark,
                new String[]{"Conjonctivite","Nuage Fantôme","Trou Noir","Cauchemar","Apocalypse","Devastation","Fissure de Membres","Poing Vampire","Devorêve"},
                0,
                23,
                17,
                105,
                100,
                230,
                175,
                50,
                new int[]{R.drawable.bte_dark,R.drawable.bte_dark,R.drawable.bte_dark,R.drawable.bte_dark,R.drawable.bte_dark,R.drawable.bte_dark,R.drawable.bte_any,R.drawable.bte_any,R.drawable.bte_dark}

        ));


        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, monsters.get(iMon));

        viewPager.setAdapter(viewPagerAdapter);


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
        final ImageView habitat = findViewById(R.id.image_arene);


        monsterName.setText(monsters.get(iMon).getMonster_name());
        monsterName.setBackgroundColor(monsters.get(iMon).getPrimaryColor());
        infoText.setText(monsters.get(iMon).getMonster_info());
        imageN0.setImageResource(monsters.get(iMon).getMonster_pics_0());
        imageN1.setImageResource(monsters.get(iMon).getMonster_pics_1());
        imageN2.setImageResource(monsters.get(iMon).getMonster_pics_2());
        imageN3.setImageResource(monsters.get(iMon).getMonster_pics_3());
        type.setImageResource(monsters.get(iMon).getType());
        atq1.setImageResource(monsters.get(iMon).getAttakType()[0]);
        atq2.setImageResource(monsters.get(iMon).getAttakType()[1]);
        atq3.setImageResource(monsters.get(iMon).getAttakType()[2]);
        atq4.setImageResource(monsters.get(iMon).getAttakType()[3]);
        atq5.setImageResource(monsters.get(iMon).getAttakType()[4]);
        atq6.setImageResource(monsters.get(iMon).getAttakType()[5]);
        atq7.setImageResource(monsters.get(iMon).getAttakType()[6]);
        atq8.setImageResource(monsters.get(iMon).getAttakType()[7]);
        atq9.setImageResource(monsters.get(iMon).getAttakType()[8]);
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
        habitat.setImageResource(monsters.get(iMon).getHabitat());



        //les variables statistiques
        final int stamina=monsters.get(iMon).getbStamina();
        final int[] force = {monsters.get(iMon).getbForce()};
        final int[] speed = {monsters.get(iMon).getbSpeed()};
        final int[] life = {monsters.get(iMon).getbLife()};

        int max=0;
        max=Math.max(monsters.get(iMon).getaForce()*80+monsters.get(iMon).getbForce(),monsters.get(iMon).getaSpeed()*80+monsters.get(iMon).getbSpeed());
        max=Math.max(max, monsters.get(iMon).getaLife()*80+monsters.get(iMon).getbLife());
        staminaBar.setMax(monsters.get(iMon).getbStamina()*2);
        forceBar.setMax(max);
        speedBar.setMax(max);
        lifeBar.setMax(max);

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
                force[0] = monsters.get(iMon).getaForce()*lvlInt+monsters.get(iMon).getbForce();
                speed[0] = monsters.get(iMon).getaSpeed()*lvlInt+monsters.get(iMon).getbSpeed();
                life[0] = monsters.get(iMon).getaLife()*lvlInt+monsters.get(iMon).getbLife();
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
