package org.beautiful_butterflies.quirky_quarks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class StandardModel extends AppCompatActivity {

    Button modelToMain;
    ImageView standardModelImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_model);

        standardModelImage = (ImageView) findViewById(R.id.standardModelImage);

    }
}
