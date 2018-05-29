package com.example.codeclan.wordcounter;

/**
 * Created by davinasanders on 28/05/2018.
 */

public class Word {

    public int CountWords(String string){
       return string.split("\\w+").length;
    }

    public String CountWordsMessage(String string){
        return  CountWords(string) + " words entered";
    }
}
