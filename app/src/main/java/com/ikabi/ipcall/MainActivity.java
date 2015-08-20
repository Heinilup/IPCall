package com.ikabi.ipcall;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        EditText et = (EditText) findViewById(R.id.et);
        SharedPreferences sp = getSharedPreferences("ip", MODE_PRIVATE);
        sp.edit().putString("ipNumber", et.getText().toString()).commit();
        Toast.makeText(getApplicationContext(), "保存成功" , Toast.LENGTH_SHORT).show();

    }
    public void click1(View v){

        Intent intent = new Intent();
        intent.setAction(intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:110"));
        startActivity(intent);
    }
}
