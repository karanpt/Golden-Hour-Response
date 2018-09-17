package com.example.currentplacedetailsonmap;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.currentplacedetailsonmap.activities.LoginActivity;

import com.example.currentplacedetailsonmap.R;
import com.example.currentplacedetailsonmap.mapactivity.MapsActivity;


/**
 * Created by Admin on 23/01/2018.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });

        button2.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToThirdActivity();
            }
        });


    }
    private void goToSecondActivity()
    {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
    private void goToThirdActivity()
    {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);

    }

}

