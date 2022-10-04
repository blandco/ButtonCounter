package com.joelbland.buttoncounter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Create a new Counter object to use for incrementing the text of @+id/buttonMain.
    public static Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        counter = new Counter();
        setContentView(R.layout.activity_main);
    }

    // The onStart method is called automatically when the app is started, when the
    // app returns from the data activity, or when the main activity is brought to
    // the foreground after it went to the background. Page 151
    public void onStart() {
        super.onStart();
        incrementButtonMainText();
    }

    public void modifyData( View v ) {
        Intent myIntent = new Intent( this, DataActivity.class );
        this.startActivity( myIntent );
    }

    public void incrementButtonMainText() {
        // Find the id for buttonMain
        Button buttonMain = findViewById(R.id.buttonMain);

        // Convert the text from buttonMain to a String
        String btnText = buttonMain.getText().toString();

        // Convert the String from btnText to an Integer
        Integer btnValue = Integer.parseInt(btnText);

        // Call the addOne method from the Counter object
        Integer newValue = counter.addOne(btnValue);

        buttonMain.setText(newValue.toString());
    }
}