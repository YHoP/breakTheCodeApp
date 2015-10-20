package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.breakthecode.R;

public class EnrollActivity extends AppCompatActivity {

    private EditText mNameInput, mEmailInput;
    private Button mSubmitButton;
    private TextView mWelcome, mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        mNameInput = (EditText) findViewById(R.id.nameInput);
        mEmailInput = (EditText) findViewById(R.id.emailInput);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mWelcome = (TextView) findViewById(R.id.Welcom);
        mMessage = (TextView) findViewById(R.id.message);
        mMessage.setVisibility(View.INVISIBLE);

        mSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = mNameInput.getText().toString();
                String email = mEmailInput.getText().toString();
                String output = String.format("Hello %s, thank you for enrolling. We will email you at %s soon!", name, email);

                mMessage.setText(output);
                mNameInput.setVisibility(View.INVISIBLE);
                mEmailInput.setVisibility(View.INVISIBLE);
                mSubmitButton.setVisibility(View.INVISIBLE);
                mMessage.setVisibility(View.VISIBLE);
            }

        });


    }

}
