package com.epicodus.breakthecode.ui;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.breakthecode.R;
import com.epicodus.breakthecode.models.Partner;
import com.epicodus.breakthecode.models.PartnerLib;

import static java.security.AccessController.getContext;

public class NonProfitActivity extends AppCompatActivity {

    private TextView mNameLabel, mDescriptionLabel;
    private ImageView mPartnerImage;
    private Button mNextButton;

    private PartnerLib mPartnerLib;
    private Partner mCurrentPartner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_profit);

        TextView nameLabel = (TextView) findViewById(R.id.nameLabel);
        Typeface fontSparkly = Typeface.createFromAsset(getAssets(), "fonts/sparkly.ttf");
        nameLabel.setTypeface(fontSparkly);

        // http://www.101apps.co.za/index.php/articles/using-custom-fonts-in-your-android-apps.html

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.description);
        mPartnerImage = (ImageView) findViewById(R.id.partnerImage);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mPartnerLib = new PartnerLib();
        mCurrentPartner = mPartnerLib.getPartners().get(0);
        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentPartner = mPartnerLib.nextPartner(mCurrentPartner);
                setLayoutContent();
            }
        });

    }

    private void setLayoutContent(){
        mNameLabel.setText(mCurrentPartner.getName());
        mDescriptionLabel.setText(mCurrentPartner.getDescription());
        mPartnerImage.setImageResource(mCurrentPartner.getImage());
    }


}
