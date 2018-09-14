package fr.wildcodeschool.projetmonsterlegend;

import android.content.Intent;
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

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setLogo(R.drawable.monsterlegends_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        ArrayList<RowItem>monsterList=
                new ArrayList<>();

        monsterList.add(new RowItem("Fire Lion", R.drawable.fire_lion_0));
        monsterList.add(new RowItem("Genie", R.drawable.genie_0));
        monsterList.add(new RowItem("Light Spirit", R.drawable.light_spirit_0));
        monsterList.add(new RowItem("Metalsaur", R.drawable.metalsaur_0));
        monsterList.add(new RowItem("Panda", R.drawable.panda_0));
        monsterList.add(new RowItem("Rockilla", R.drawable.rockilla_0a));
        monsterList.add(new RowItem("Thunder Eagle", R.drawable.thunder_eagle_0));
        monsterList.add(new RowItem("Turtle", R.drawable.turtle_0));
        monsterList.add(new RowItem("Tyrannoking", R.drawable.tyrannoking_0));


        CustomAdapter adapter =new CustomAdapter(this, monsterList);
        ListView listmonster=findViewById(R.id.list);
        listmonster.setAdapter(adapter);

        listmonster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent goToMonsterActivity = new Intent(MainActivity.this,
                        MonstersActivity.class);
                MainActivity.this.startActivity(goToMonsterActivity);
            }
        });
    }
}
