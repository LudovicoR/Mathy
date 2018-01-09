package com.fredrikrenander.mathy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int value1;
    int value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNewNumbers();



    }


    public void onSubmitClick (View view){
        TextView Answer = findViewById(R.id.Answer);
        EditText Attempt = findViewById(R.id.Attempt);
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        if(userAnswer == value1+value2) {
            Answer.setText("Correct!");

        } else {
            Answer.setText("Wrong! The correct answer was: " + (value1+value2));
        }
        setNewNumbers();

    }

    private void setNewNumbers () {
        Random r = new Random();
        value1 = r.nextInt(999);
        value2 = r.nextInt(999);
        TextView Number1 = findViewById(R.id.Numbers);
        Number1.setText(""+value1 + " + " + value2);
        EditText Attempt = findViewById(R.id.Attempt);
        Attempt.setText("");

    }



}
