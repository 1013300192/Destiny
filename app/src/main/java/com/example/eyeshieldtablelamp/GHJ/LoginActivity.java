package com.example.eyeshieldtablelamp.ghj5_1to5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eyeshieldtablelamp.R;

public class LoginActivity extends AppCompatActivity {

    private Button mBtnLogin;
    private Button mBtnRegister;
    private EditText mEditName;
    private EditText mEditPassname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBtnRegister=findViewById(R.id.btn_register);
        mBtnLogin=findViewById(R.id.btn_login);
        mEditName=findViewById(R.id.edit_name);
        mEditPassname=findViewById(R.id.edit_pass);

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
