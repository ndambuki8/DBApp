package com.example.ndambuki.dbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textViews;

    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViews = (TextView) findViewById(R.id.textView);

        DatabaseHelper db = new DatabaseHelper(this);

        //inserting contacts

        db.addContact(new Contact(1,"name1","1111111"));
        db.addContact(new Contact(2,"name2","2222222"));
        db.addContact(new Contact(3,"name3","3333333"));
        db.addContact(new Contact(4,"name4","4444444"));

        //reading and displaying all contacts

        List<Contact> contacts = db.getAllContacts();

        for (Contact c: contacts){
            String log = "ID: " + c.getId() + ", NAME: " + c.getName() + ", NUMBER: " + c.getPhone_number() +  "\n";
        System.out.println(c.getId()+"oopp");

            text = text + log;
        }

        textViews.setText(text);
    }
}
