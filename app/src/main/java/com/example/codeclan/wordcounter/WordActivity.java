package com.example.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        questionEditText = findViewById(R.id.question_text);
        answerText = findViewById(R.id.answerText);
        countButton = findViewById(R.id.countButton);
    }

    public void onCountButtonClicked(View Button) {
//          Log.d(getClass().toString(), "onCountButtonClicked was called");
//
//       Log.d(getClass().toString(), "The question asked was: " + question);


    Word word = new Word();
        String question = questionEditText.getText().toString();
    answerText.setText(word.CountWordsMessage(question));

    }
}
