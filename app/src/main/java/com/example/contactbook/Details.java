package com.example.contactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    private TextView name_TextView, gmail_TextView, phone1_TextView, phone2_TextView, phone3_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name_TextView = findViewById(R.id.name_TextView_id);
        gmail_TextView = findViewById(R.id.gmail_TextView_id);
        phone1_TextView = findViewById(R.id.phone1_EditText_id);
        phone2_TextView = findViewById(R.id.phone2_EditText_id);
        phone3_TextView = findViewById(R.id.phone3_EditText_id);

        name_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Details.this, AddContact.class);
                startActivity(intent);




            }
        });
    }
}
