package com.example.necro.msitfortut;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class grade extends AppCompatActivity {

    MyDBHelper mDbHelper = new MyDBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        Intent intent = getIntent();
        final String course = intent.getStringExtra("course");

        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursor = db.query("course",null,"name=?",new String[]{course},null,null,null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        TextView textView = findViewById(R.id.gtextView);
        while (cursor.moveToNext()) {
            Log.e("course找到資料",cursor.getString(0)+cursor.getString(1)+cursor.getString(2));
            textView.setText(textView.getText()+cursor.getString(1));
        }
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = mDbHelper.getReadableDatabase();
                ContentValues values = new ContentValues();
                EditText editText = findViewById(R.id.score);
                int grade = Integer.parseInt(String.valueOf(editText.getText()));
                Log.e("分數",""+grade);
                values.put("grade",grade);
                db.update("course",values,"name=?",new String[]{course});
                finish();
            }
        });

    }
}
