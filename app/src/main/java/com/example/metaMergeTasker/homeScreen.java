package com.example.metaMergeTasker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageButton;

public class homeScreen extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // Adam: Create button object pointers, so we can use them :D
        ImageButton pwGen = (ImageButton) findViewById(R.id.btn_generator);
        ImageButton lists = (ImageButton) findViewById(R.id.btn_lists);
        ImageButton organiser = (ImageButton) findViewById(R.id.btn_organiser);
        ImageButton expMang = (ImageButton) findViewById(R.id.btn_expense);
        ImageButton pwMang = (ImageButton) findViewById(R.id.btn_manager);

        // Adam: PWGen Image Button Action
        pwGen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(homeScreen.this, passwordGeneratorScreen.class);
                startActivity(intent);
            }
        });


        // Adam: Note Taker Image Button Action
        lists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(homeScreen.this, toDoScreen.class);
                startActivity(intent);
            }
        });

        // Adam: Organiser Button Action
        organiser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //new extraFunctions.ShowToast(homeScreen.this, true, "Organiser - Yet to be implemented!");
                Intent intent=new Intent(homeScreen.this, noteMainScreen.class);
                startActivity(intent);
            }
        });

         // Adam: Expense Manager Button Action
        expMang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(homeScreen.this, expenseScreen.class);
                startActivity(intent);
            }
        });

        // Adam: Password Manager Button Action
        pwMang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new extraFunctions.ShowToast(homeScreen.this, true, "Password Manager - Yet to be implemented!");
            }
        });
    }
}