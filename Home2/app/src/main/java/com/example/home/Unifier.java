package com.example.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Unifier extends AppCompatActivity {
    Button btna,btne,btni,btnw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unifier);

        btna = (Button)findViewById(R.id.btn2);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),NewAnnouncement.class);
                startActivity(i);
            }
        });


        btna = (Button)findViewById(R.id.btn1);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),AnnouncementsList.class);
                startActivity(i);
            }
        });

        btne = (Button)findViewById(R.id.btn4);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),CurrentExpenses.class);
                startActivity(i);
            }
        });


        btne = (Button)findViewById(R.id.btn3);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),ExpensesList.class);
                startActivity(i);
            }
        });


        btni = (Button)findViewById(R.id.btn6);
        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),CurrentIssues.class);
                startActivity(i);
            }
        });

        btni = (Button)findViewById(R.id.btn5);
        btni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),IssuesList.class);
                startActivity(i);
            }
        });

        btnw = (Button)findViewById(R.id.btn8);
        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),NewWorker.class);
                startActivity(i);
            }
        });

        btnw = (Button)findViewById(R.id.btn7);
        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),WorkersList.class);
                startActivity(i);
            }
        });





    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_residents:
                break;
        }
        return super.onOptionsItemSelected(item);


    }
}
