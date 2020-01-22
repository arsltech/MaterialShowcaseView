package com.developer.arsltech.materialshowcaseview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import co.mobiwise.materialintro.animation.MaterialIntroListener;
import co.mobiwise.materialintro.shape.Focus;
import co.mobiwise.materialintro.shape.FocusGravity;
import co.mobiwise.materialintro.shape.ShapeType;
import co.mobiwise.materialintro.view.MaterialIntroView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txtShowcase);

        new MaterialIntroView.Builder(this)
                .enableDotAnimation(true)
                .enableIcon(false)
                .setFocusGravity(FocusGravity.CENTER)
                .setFocusType(Focus.MINIMUM)
                .setDelayMillis(1000)
                .enableFadeAnimation(true)
                .performClick(true)
                .setInfoText("Hi There! This is our TextView for Showcase")
                .setShape(ShapeType.RECTANGLE)
                .setTarget(textView)
                .setUsageId("intro_card")
                .setMaskColor(getResources().getColor(R.color.greenTransparent))//THIS SHOULD BE UNIQUE ID

                .setListener(new MaterialIntroListener() {
                    @Override
                    public void onUserClicked(String materialIntroViewId) {

                        Toast.makeText(MainActivity.this, "Showcase Click", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();


    }
}
