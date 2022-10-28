package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edittextLogin,edit_password;
    TextView  textView,tvLog,tvSuccess;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_password = findViewById(R.id.edit_password);
        textView = findViewById(R.id.tv_text);
        tvLog = findViewById(R.id.tv_log);
        edittextLogin = findViewById(R.id.edit_name);
        tvSuccess = findViewById(R.id.tv_success);

        btn = findViewById(R.id.btn_login);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittextLogin.getText().toString().equals("Clown") && edit_password.getText().toString().equals("password")) {
                    edittextLogin.getText().clear();
                    Toast.makeText(MainActivity.this, "Вход выполнен", Toast.LENGTH_LONG).show();
                    edit_password.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    edittextLogin.setVisibility(View.GONE);
                    btn.setVisibility(View.GONE);
                    tvLog.setVisibility(View.GONE);
                    tvSuccess.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}