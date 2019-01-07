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
    String course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        Intent intent = getIntent();
        final String course = intent.getStringExtra("course");

        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursor = db.query("pac",null,"course=?",new String[]{course},null,null,null);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        TextView textView = findViewById(R.id.gtextView);
        while (cursor.moveToNext()) {
            Log.e("course找到資料",cursor.getString(2));
            textView.setText(textView.getText()+cursor.getString(2));
        }
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = mDbHelper.getReadableDatabase();
                ContentValues values = new ContentValues();
                EditText editText = findViewById(R.id.score);
                int grade = Integer.parseInt(String.valueOf(editText.getText()));
                values.put("grade",grade);
                db.update("course",values,"course=?",new String[]{course});
                finish();
            }
        });

    }
}
