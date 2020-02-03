package com.buddytrainers.citiestour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LahoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lahore);
    }

    public void MainActivity(View view)
    {
        Intent objectIntent=new Intent(this, MainActivity.class);
        startActivity(objectIntent);
        this.finish();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Home", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void moveToMain(View view)
    {
        Intent objectIntent=new Intent(this, MainActivity.class);
        startActivity(objectIntent);
        this.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Welcome to Home", Toast.LENGTH_SHORT).show();
    }
}
