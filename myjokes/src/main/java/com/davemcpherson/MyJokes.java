package com.davemcpherson;

import java.util.ArrayList;
import java.util.Random;

public class MyJokes {

    private ArrayList<Joke> jokes = new ArrayList<Joke>();

    public MyJokes(){
        jokes.add(new Joke("What do you call it when 2 dinosuars get in a car accident?","A T-wreck"));
        jokes.add(new Joke("What kind of bear has no teeth?","A gummy bear"));
        jokes.add(new Joke("What do you call an alligator in a vest?","An investigator"));
    }

    public ArrayList<Joke> getJokes() {
        return jokes;
    }

    public Joke getRandomJoke(){
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }
}
