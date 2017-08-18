package com.example.pawelschmidt.drawermenu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ImportActivity extends AppCompatActivity {

    public static Intent newIntent(final Context context) {
        return new Intent(context, ImportActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import);

        final TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("asdfa");

    }
}
