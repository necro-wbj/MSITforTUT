package com.example.necro.msitfortut;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class skill extends AppCompatActivity {

    MyDBHelper mDbHelper = new MyDBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from course", null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        while (cursor.moveToNext()) {
            Log.d("skill找到值",cursor.getString(1));
            adapter.add(cursor.getString(1));
        }

        ((ListView) findViewById(R.id.slist)).setAdapter(adapter);
        ((ListView) findViewById(R.id.slist)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = "沒有值";
                SQLiteDatabase db = mDbHelper.getReadableDatabase();
                Cursor cursor = db.query("course", null, "_id=" + id+1, null, null, null, null, null);
                while (cursor.moveToNext()) {
                    data = cursor.getString(1);
                }
                Log.d("skill傳值", data);

                Intent intent = new Intent(skill.this, grade.class);
                intent.putExtra("course", data);
                startActivity(intent);
            }
        });

        findViewById(R.id.sthome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
