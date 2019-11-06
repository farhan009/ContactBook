package com.example.contactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddContact extends AppCompatActivity {

    private EditText nameEditText, phone1EditText, phone2EditText, phone3EditText, emilEditText;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        nameEditText = findViewById(R.id.name_EditText_id);
        phone1EditText = findViewById(R.id.phone1_EditText_id);
        phone2EditText = findViewById(R.id.phone2_EditText_id);
        phone3EditText = findViewById(R.id.phone3_EditText_id);
        emilEditText = findViewById(R.id.email_EditText_id);
        floatingActionButton = findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String phone1 = phone1EditText.getText().toString();
                String phone2 = phone2EditText.getText().toString();
                String phone3 = phone3EditText.getText().toString();
                String email = emilEditText.getText().toString();

                Intent intent = new Intent(AddContact.this, ContactView.class);
                startActivity(intent);
            }
        });
    }
}
