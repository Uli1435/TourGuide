package com.example.sedkol.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NightlifeContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nightlife_container);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.nightlife_container, new NightlifeFragment()).commit();
    }
}
