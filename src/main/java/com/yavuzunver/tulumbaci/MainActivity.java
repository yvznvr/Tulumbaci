package com.yavuzunver.tulumbaci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] ulkeler =
            {"Liste1","Liste2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((Button) findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });


        ListView listemiz=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler);
        listemiz.setAdapter(veriAdaptoru);



    }


}