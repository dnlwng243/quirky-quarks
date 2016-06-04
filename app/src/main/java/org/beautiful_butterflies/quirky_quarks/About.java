package org.beautiful_butterflies.quirky_quarks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.beautiful_butterflies.quirky_quarks.about.AboutCreators;
import org.beautiful_butterflies.quirky_quarks.about.GameHelp;
import org.beautiful_butterflies.quirky_quarks.about.RecipeHelp;

public class About extends AppCompatActivity {

    Button gameHelpButton;
    Button recipeHelpButton;
    Button aboutCreatorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        gameHelpButton = (Button) findViewById(R.id.gameHelpButton);
        recipeHelpButton = (Button) findViewById(R.id.recipeHelpButton);
        aboutCreatorsButton = (Button) findViewById(R.id.aboutCreatorsButton);

        gameHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, GameHelp.class));
            }
        });

        recipeHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, RecipeHelp.class));
            }
        });

        aboutCreatorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About.this, AboutCreators.class));
            }
        });
    }
}
