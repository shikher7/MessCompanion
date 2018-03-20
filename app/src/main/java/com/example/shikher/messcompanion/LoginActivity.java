package com.example.shikher.messcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.login_button)
    Button loginButton;
    @BindView(R.id.editText_regNo)
    EditText editText_regNo;
    @BindView(R.id.editText_password)
    EditText editText_password;
    public static String result="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.login_button)
    public void onUserLogin(View v) {
        String regNo=editText_regNo.getText().toString();
        String pass=editText_password.getText().toString();
        if (regNo.matches("")||pass.matches(""))
            Toast.makeText(this, "Fields are empty.", Toast.LENGTH_SHORT).show();
        else {
            Intent i = new Intent(this, MainActivity.class);

            this.startActivity(i);
        }


    }





}
