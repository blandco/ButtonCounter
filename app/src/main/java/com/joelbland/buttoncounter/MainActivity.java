package com.joelbland.buttoncounter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMain = findViewById(R.id.buttonMain);

    }

    public void modifyData( View v ) {
        Intent myIntent = new Intent( this, DataActivity.class );
        this.startActivity( myIntent );
    }
}