package com.apkglobal.prototype;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button btn_forgot, btn_facebook, btn_gmail, btn_signin;
    Methords methords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn_signin = (Button) findViewById(R.id.btn_signin);
        btn_facebook = (Button) findViewById(R.id.btn_facebook);
        btn_forgot = (Button) findViewById(R.id.btn_forgot);
        btn_gmail = (Button) findViewById(R.id.btn_gmail);
        methords = new Methords(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/"));
                startActivity(intent);
            }
        });


        btn_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
                startActivity(intent);

            }
        });
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,ThirdActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
