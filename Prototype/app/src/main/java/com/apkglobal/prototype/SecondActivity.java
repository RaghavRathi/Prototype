package com.apkglobal.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button btn_electromagnetism, btn_c, btn_python, btn_create, btn_search, btn_me, btn_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_c = (Button) findViewById(R.id.btn_C);
        btn_electromagnetism = (Button) findViewById(R.id.btn_electromagnetism);
        btn_python = (Button) findViewById(R.id.btn_python);
        btn_new = (Button) findViewById(R.id.btn_new);
        btn_me = (Button) findViewById(R.id.btn_me);
        btn_search = (Button) findViewById(R.id.btn_search);
        btn_create = (Button) findViewById(R.id.btn_create);
        btn_electromagnetism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent);
            }
        });
        btn_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent);

            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent);
            }
        });
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

    }
}