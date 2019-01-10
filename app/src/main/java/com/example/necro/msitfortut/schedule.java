package com.example.necro.msitfortut;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class schedule extends AppCompatActivity {

    MyDBHelper mDbHelper = new MyDBHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        SharedPreferences save = this.getSharedPreferences("data", 0);
//        Cursor cursor = db.query("course,profession,pac",null,"course.name=pac.course and profession.name=? and course.grade>=60",new String[]{save.getString("profession","")},null,null,null);
        String profession = save.getString("profession","空值");
        Log.e("SharedPreferences",profession);
        Cursor cursor = db.query("course,profession,pac", null, "course.name=pac.course and pac.profession=? and pac.profession=profession.name and course.grade>=60", new String[]{profession}, null, null, null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        Cursor mcursor = db.query("course,profession,pac", null, "course.name=pac.course and pac.profession=? and pac.profession=profession.name", new String[]{profession}, null, null, null);
        int progress = cursor.getCount();
        int max = mcursor.getCount();
        ((TextView)findViewById(R.id.textView)).setText(progress+"/"+max);
        ((ProgressBar)findViewById(R.id.progressBar)).setMax(max);
        ((ProgressBar)findViewById(R.id.progressBar)).setProgress(progress);
        ((ListView) findViewById(R.id.sclist)).setAdapter(adapter);
        while (cursor.moveToNext()) {
            String msg="";
            for (int i = cursor.getColumnCount()-1; i >= 0; i--) {
                msg = msg + cursor.getString(i);
            }
            Log.e("schedule找到資料", msg);
            adapter.add(cursor.getString(1));
        }


        findViewById(R.id.scthome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
