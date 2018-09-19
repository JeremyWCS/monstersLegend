package fr.wildcodeschool.projetmonsterlegend;

import android.content.ClipData;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer soundFond = MediaPlayer.create(this,R.raw.songfond);
        soundFond.start();


        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    //Affiche le slide ecrit dans le ImageAdapter.java.


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setLogo(R.drawable.monsterlegends_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayList<RowItem>monsterList=
                new ArrayList<>();

        monsterList.add(new RowItem("Fire Lion", R.drawable.fire_lion_0, R.drawable.bte_fire, R.color.fireLionList));
        monsterList.add(new RowItem("Genie", R.drawable.genie_0, R.drawable.bte_magic, R.color.genieList));
        monsterList.add(new RowItem("Light Spirit", R.drawable.light_spirit_0, R.drawable.bte_light, R.color.lightSpiritList));
        monsterList.add(new RowItem("Metalsaur", R.drawable.metalsaur_0, R.drawable.bte_metal, R.color.metalsaurList));
        monsterList.add(new RowItem("Panda", R.drawable.panda_0, R.drawable.bte_nature, R.color.pandaList));
        monsterList.add(new RowItem("Rockilla", R.drawable.rockilla_0a, R.drawable.bte_earth, R.color.rockillaList));
        monsterList.add(new RowItem("Thunder Eagle", R.drawable.thunder_eagle_0, R.drawable.bte_thunder, R.color.thunderEagleList));
        monsterList.add(new RowItem("Turtle", R.drawable.turtle_0, R.drawable.bte_water, R.color.turtleList));
        monsterList.add(new RowItem("Tyrannoking", R.drawable.tyrannoking_0, R.drawable.bte_dark, R.color.tyrannokingList));



        CustomAdapter Adapter =new CustomAdapter(this, monsterList);
        ListView listmonster=findViewById(R.id.list);
        listmonster.setAdapter(Adapter);


        listmonster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                soundFond.stop();

                Intent goToMonsterActivity = new Intent(MainActivity.this,
                        MonstersActivity.class);
                MainActivity.this.startActivity(goToMonsterActivity);
            }
        });

    }

}
