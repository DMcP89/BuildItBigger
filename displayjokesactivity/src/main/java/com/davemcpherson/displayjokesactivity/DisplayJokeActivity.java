package com.davemcpherson.displayjokesactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.davemcpherson.Joke;
import com.davemcpherson.MyJokes;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        MyJokes myJokes = new MyJokes();
        Joke joke = myJokes.getRandomJoke();

        TextView setupTextView = (TextView) findViewById(R.id.setup_text_view);
        TextView punchlineTextView = (TextView) findViewById(R.id.punchline_text_view);

        setupTextView.setText(joke.getSetUp());
        punchlineTextView.setText(joke.getPunchLine());
    }
}
