package com.example.onsen.onsenapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.onsen.onsenapplication.R.id.editText2;
import static com.example.onsen.onsenapplication.R.id.editText3;
import static com.example.onsen.onsenapplication.R.id.editText4;
import static com.example.onsen.onsenapplication.R.id.editText5;

public class MainActivity extends AppCompatActivity {
    String editTextName;
    String editTextLName;
    String editTextAge;
    String editTextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Button button = (Button) findViewById(R.id.button);
        SharedPreferences shared = getSharedPreferences("onsen", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = shared.edit();
        edit.putString("name","on");
        edit.putInt("id",10);
        edit.commit();

        button.setOnClickListener(
                new View.OnClickListener(){
                    public  void onClick(View view){
                        EditText editTextName = (EditText) findViewById(editText2);
                        editText = editTextName.getText().toString();
                        EditText editTextLName = (EditText) findViewById(editText3);
                        editText = editTextLName.getText().toString();
                        EditText editTextAge = (EditText) findViewById(editText4);
                        editText = editTextAge.getText().toString();
                        EditText editTextAddress = (EditText) findViewById(editText5);
                        editText = editTextAddress.getText().toString();

                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("editText",editText);
                        intent.putExtra("tal","0848454544");
                        startActivity(intent);
                    }
                }
        );*/

    }
    public void date(View view) {
        EditText editTextName1 = (EditText) findViewById(editText2);
        editTextName = editTextName1.getText().toString();

        EditText editTextLName2 = (EditText) findViewById(editText3);
        editTextLName = editTextLName2.getText().toString();

        EditText editTextAge3 = (EditText) findViewById(editText4);
        editTextAge = editTextAge3.getText().toString();

        EditText editTextAddress4 = (EditText) findViewById(editText5);
        editTextAddress = editTextAddress4.getText().toString();

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("editTextName",editTextName);
        intent.putExtra("editTextLName",editTextLName);
        intent.putExtra("editTextAge",editTextAge);
        intent.putExtra("editTextAddress",editTextAddress);
        intent.putExtra("tal","0848454544");
        startActivity(intent);


    }
}
