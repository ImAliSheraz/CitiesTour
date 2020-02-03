package com.buddytrainers.citiestour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLahoreActivity(View view)
    {
        Intent objectIntent=new Intent(this, LahoreActivity.class);
        startActivity(objectIntent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Lahore", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showKarachiActivity(View view)
    {
        Intent objectIntent=new Intent(this, KarachiActivity.class);
        startActivity(objectIntent);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Karachi", Toast.LENGTH_SHORT);
        toast.show();
    }
}
