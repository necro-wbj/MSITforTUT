package com.example.necro.msitfortut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(StartProfession);
        findViewById(R.id.button2).setOnClickListener(StartSkill);
        findViewById(R.id.button3).setOnClickListener(StartSchedule);
    }

    View.OnClickListener StartProfession = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, profession.class));
        }
    };

    View.OnClickListener StartSkill = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,skill.class));
        }
    };

    View.OnClickListener StartSchedule = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,schedule.class));
        }
    };


}
