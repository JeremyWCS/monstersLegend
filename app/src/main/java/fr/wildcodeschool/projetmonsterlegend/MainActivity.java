package fr.wildcodeschool.projetmonsterlegend;

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




        ImageView imageN0 = findViewById(R.id.image_n0);
        ImageView imageN1 = findViewById(R.id.image_n1);
        ImageView imageN2 = findViewById(R.id.image_n2);
        ImageView imageN3 = findViewById(R.id.image_n3);
        final EditText editLevel = findViewById(R.id.edit_level);
        Button btnLvl = findViewById(R.id.button_lvl);




        imageN0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this ,R.drawable.fire_lion_0);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("0");
            }
        });

        imageN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this ,R.drawable.fire_lion_1);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("4");
            }
        });

        imageN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this ,R.drawable.fire_lion_2);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("10");
            }
        });

        imageN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageCenter = findViewById(R.id.image_center);
                Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this ,R.drawable.fire_lion_3);
                imageCenter.setImageDrawable(drawableCenter);
                editLevel.setText("20");
            }
        });

        btnLvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String levelValue = editLevel.getText().toString();
                int levelInt = Integer.valueOf(levelValue);

                if (levelInt>70){
                    levelInt=70;
                    editLevel.setText("70");
                }

                if (levelInt >= 0 && levelInt <= 3) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this, R.drawable.fire_lion_0);
                    imageCenter.setImageDrawable(drawableCenter);
                }

                if (levelInt >= 4 && levelInt <= 9) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this, R.drawable.fire_lion_1);
                    imageCenter.setImageDrawable(drawableCenter);
                }

                if (levelInt >= 10 && levelInt <= 19) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this, R.drawable.fire_lion_2);
                    imageCenter.setImageDrawable(drawableCenter);
                }

                if (levelInt >= 20 && levelInt <= 70) {
                    ImageView imageCenter = findViewById(R.id.image_center);
                    Drawable drawableCenter = ContextCompat.getDrawable(MainActivity.this, R.drawable.fire_lion_3);
                    imageCenter.setImageDrawable(drawableCenter);
                }

            }
        });


        }
}
