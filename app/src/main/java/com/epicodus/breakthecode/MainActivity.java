package com.epicodus.breakthecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button mEnrollButton;
    private Button mSponsorsButton;
    private Button mNonProfitPartnersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mSponsorsButton = (Button) findViewById(R.id.sponsorButton);
        mNonProfitPartnersButton = (Button) findViewById(R.id.nonProfitButton);

        mEnrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(intent);
            }
        });

        mSponsorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(intent);
            }
        });

        mNonProfitPartnersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NonProfitActivity.class);
                startActivity(intent);
            }
        });
    }
}
