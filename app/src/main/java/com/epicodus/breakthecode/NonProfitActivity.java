package com.epicodus.breakthecode;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class NonProfitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        TextView nameLabel = (TextView) findViewById(R.id.nameLabel);
        Typeface fontSparkly = Typeface.createFromAsset(getAssets(), "fonts/sparkly.ttf");
        nameLabel.setTypeface(fontSparkly);

        // http://www.101apps.co.za/index.php/articles/using-custom-fonts-in-your-android-apps.html

    }

}
