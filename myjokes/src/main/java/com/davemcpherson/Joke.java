package com.davemcpherson;

/**
 * Created by dave on 1/11/2016.
 */
public class Joke {

    private String setUp;
    private String punchLine;

    public Joke(){}

    public Joke(String setUp, String punchLine) {
        this.setUp = setUp;
        this.punchLine = punchLine;
    }

    public String getSetUp() {
        return setUp;
    }

    public void setSetUp(String setUp) {
        this.setUp = setUp;
    }

    public String getPunchLine() {
        return punchLine;
    }

    public void setPunchLine(String punchLine) {
        this.punchLine = punchLine;
    }
}
