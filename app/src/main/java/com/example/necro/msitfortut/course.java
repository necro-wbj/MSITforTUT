package com.example.necro.msitfortut;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Intent intent = getIntent();
        final String profession = intent.getStringExtra("profession");

        MyDBHelper mDbHelper = new MyDBHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        Cursor cursor = db.query("pac",null,"profession=?",new String[]{profession},null,null,null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        while (cursor.moveToNext()) {
            Log.d("course找到資料",cursor.getString(2));
            adapter.add(cursor.getString(2));
        }
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

        Cursor lcursor = db.query("pal",null,"profession=?",new String[]{profession},null,null,null);
        ArrayAdapter<String> ladapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        while (lcursor.moveToNext()) {
            String msg="";
            for (int i = lcursor.getColumnCount()-1; i >= 0; i--) {
                msg = msg + lcursor.getString(i);
            }
            Log.e("找到證照",msg);
            ladapter.add(lcursor.getString(2));
        }
        ((ListView)findViewById(R.id.lclist)).setAdapter(ladapter);


        findViewById(R.id.previous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.pthome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(course.this,MainActivity.class));
                finish();
            }
        });
    }
}
