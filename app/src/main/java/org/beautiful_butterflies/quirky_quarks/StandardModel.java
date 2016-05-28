package org.beautiful_butterflies.quirky_quarks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import org.beautiful_butterflies.quirky_quarks.particle_descriptions.CharmQuark;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.DownQuark;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.Gluon;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.TopQuark;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.UpQuark;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.StrangeQuark;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.BottomQuark;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.Photon;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.Electron;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.Muon;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.Tau;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.ZBoson;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.ElectronNeutrino;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.MuonNeutrino;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.TauNeutrino;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.WBoson;
import org.beautiful_butterflies.quirky_quarks.particle_descriptions.HiggsBoson;

public class StandardModel extends AppCompatActivity {

    ImageView upQuarkImage;
    ImageView charmQuarkImage;
    ImageView topQuarkImage;
    ImageView downQuarkImage;
    ImageView strangeQuarkImage;
    ImageView bottomQuarkImage;
    ImageView electronImage;
    ImageView muonImage;
    ImageView tauImage;
    ImageView electronNeutrinoImage;
    ImageView muonNeutrinoImage;
    ImageView tauNeutrinoImage;
    ImageView gluonImage;
    ImageView photonImage;
    ImageView zBosonImage;
    ImageView wBosonImage;
    ImageView higgsBosonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_model);

        upQuarkImage = (ImageView) findViewById(R.id.upQuarkImage);
        charmQuarkImage = (ImageView) findViewById(R.id.charmQuarkImage);
        topQuarkImage = (ImageView) findViewById(R.id.topQuarkImage);
        downQuarkImage = (ImageView) findViewById(R.id.downQuarkImage);
        strangeQuarkImage = (ImageView) findViewById(R.id.strangeQuarkImage);
        bottomQuarkImage = (ImageView) findViewById(R.id.bottomQuarkImage);
        electronImage = (ImageView) findViewById(R.id.electronImage);
        muonImage = (ImageView) findViewById(R.id.muonImage);
        tauImage = (ImageView) findViewById(R.id.tauImage);
        electronNeutrinoImage = (ImageView) findViewById(R.id.electronNeutrinoImage);
        muonNeutrinoImage = (ImageView) findViewById(R.id.muonNeutrinoImage);
        tauNeutrinoImage = (ImageView) findViewById(R.id.tauNeutrinoImage);
        gluonImage = (ImageView) findViewById(R.id.gluonImage);
        photonImage = (ImageView) findViewById(R.id.photonImage);
        zBosonImage = (ImageView) findViewById(R.id.zBosonImage);
        wBosonImage = (ImageView) findViewById(R.id.wBosonImage);
        higgsBosonImage = (ImageView) findViewById(R.id.higgsBosonImage);

        upQuarkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, UpQuark.class));
            }
        });

        charmQuarkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, CharmQuark.class));
            }
        });

        topQuarkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, TopQuark.class));
            }
        });

        gluonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, Gluon.class));
            }
        });

        downQuarkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, DownQuark.class));
            }
        });

        strangeQuarkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, StrangeQuark.class));
            }
        });

        bottomQuarkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, BottomQuark.class));
            }
        });

        photonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, Photon.class));
            }
        });

        electronImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, Electron.class));
            }
        });

        muonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, Muon.class));
            }
        });

        tauImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, Tau.class));
            }
        });

        zBosonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, ZBoson.class));
            }
        });

        electronNeutrinoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, ElectronNeutrino.class));
            }
        });

        muonNeutrinoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, MuonNeutrino.class));
            }
        });

        tauNeutrinoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, TauNeutrino.class));
            }
        });

        wBosonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, WBoson.class));
            }
        });

        higgsBosonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StandardModel.this, HiggsBoson.class));
            }
        });
    }
}
