package com.example.guessinggame;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editGuess;
    private Button btnGuess;
    private TextView txtGuess;
    private TextView txtGuess2;
    private TextView txtGuess3;
    private int theNumber;
    public void checkGuess() {
        String guessText = editGuess.getText().toString();
        String message = "";
	try {
	int guess = Integer.parseInt(guessText);
            if (guess < theNumber)
                message = guess + " is too low. Try again.";
            else if (guess > theNumber)
                message = guess + " is too high. Try again.";
            else {
                message = guess + " is correct. You win! Let's play again!"; newGame();
            }
	} catch (Exception e) {
            message = "Enter a whole number between 1 and 100.";
	} finally {
            txtGuess3.setText(message);
            editGuess.requestFocus();
        }
    }

    public void newGame() { theNumber = (int)(Math.random() * 100 + 1);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGuess = (Button) findViewById(R.id.btnGuess);
        editGuess = (EditText) findViewById(R.id.editGuess);
        txtGuess = (TextView) findViewById(R.id.txtGuess);
        txtGuess2 = (TextView) findViewById(R.id.txtGuess2);
        txtGuess3 = (TextView) findViewById(R.id.txtGuess3);
        newGame();
        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkGuess();
            }
        });
    }
}