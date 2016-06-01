package org.beautiful_butterflies.quirky_quarks;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
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

        upQuarkImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    upQuarkImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    upQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        upQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        charmQuarkImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    charmQuarkImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    charmQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        charmQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        topQuarkImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    topQuarkImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    topQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        topQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        downQuarkImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    downQuarkImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    downQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        downQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        strangeQuarkImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    strangeQuarkImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    strangeQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        strangeQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        bottomQuarkImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    bottomQuarkImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    bottomQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        bottomQuarkImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        electronImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    electronImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    electronImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        electronImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        muonImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    muonImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    muonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        muonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        tauImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tauImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tauImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        tauImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        electronNeutrinoImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    electronNeutrinoImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    electronNeutrinoImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        electronNeutrinoImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        muonNeutrinoImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    muonNeutrinoImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    muonNeutrinoImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        muonNeutrinoImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        tauNeutrinoImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tauNeutrinoImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tauNeutrinoImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        tauNeutrinoImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        gluonImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    gluonImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    gluonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        gluonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        photonImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    photonImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    photonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        photonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        zBosonImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    zBosonImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    zBosonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        zBosonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        wBosonImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    wBosonImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    wBosonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        wBosonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

        higgsBosonImage.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    higgsBosonImage.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    higgsBosonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        higgsBosonImage.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                return false;
            }
        });

    }

}
