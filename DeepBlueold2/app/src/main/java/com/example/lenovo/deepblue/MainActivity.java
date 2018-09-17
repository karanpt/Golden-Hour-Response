package com.example.lenovo.deepblue;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.lenovo.deepblue.mapactivity.MapsActivity;

public class MainActivity extends AppCompatActivity {


    private Button mVolunteer, mPeople, mNumber , mEmergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPeople = (Button) findViewById(R.id.people);
        mVolunteer = (Button) findViewById(R.id.volunteer);
        mNumber = (Button) findViewById(R.id.am);
        mEmergency = (Button) findViewById(R.id.em);
         startService(new Intent(MainActivity.this, OnAppKilled.class));

        mVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Volunteerlogin.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Userlogin.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        mNumber.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:102"));
                startActivity(callIntent);

            }

        });
        mEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
