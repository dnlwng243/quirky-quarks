package org.beautiful_butterflies.quirky_quarks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class StandardModel extends AppCompatActivity {

    Button modelToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_model);

        modelToMain = (Button) findViewById(R.id.modelToMain);

        modelToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, MainActivity.class));
            }
        });
    }
}
