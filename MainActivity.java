package com.example.satish.click;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);

    }

    public void login(View view) {
        String username=e1.getText().toString();
        String password=e2.getText().toString();
        String type="clogin";
        BackgroudWorker bw=new BackgroudWorker(this);
        bw.execute(type,username,password);
    }

    public void reg(View view) {
        Intent i = new Intent(this,register.class);
        startActivity(i);
    }
}
