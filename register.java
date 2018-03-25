package com.example.satish.click;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class register extends AppCompatActivity {
EditText e1,e2;
String name,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
    }

    public void register(View view) {
        String name=e1.getText().toString();
        String email=e2.getText().toString();
        String type="cregister";
        BackgroudWorker bw=new BackgroudWorker(this);
        bw.execute(type,name,email);
    }
}
