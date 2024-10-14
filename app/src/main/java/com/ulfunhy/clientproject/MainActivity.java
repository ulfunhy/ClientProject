package com.ulfunhy.clientproject;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText LoginID, LoginPw;
    Button LoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        LoginID = findViewById(R.id.LoginID);
        LoginPw = findViewById(R.id.LoginPw);

        LoginBtn = findViewById(R.id.LoginBtn);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(MainActivity.this, LoginActivity.class);
                String loginID = MainActivity.this.LoginID.getText().toString();
                String loginPw = MainActivity.this.LoginPw.getText().toString();
                mainIntent.putExtra("ID",loginID);
                mainIntent.putExtra("Password",loginPw);


                startActivity(mainIntent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}