package com.example.codeclan.wordcounter;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davinasanders on 28/05/2018.
 */

public class WordTest {
    Word word;

    @Before

    public void before(){
        word = new Word();
    }
//        @Test
//        public void useAppContext() throws Exception {
//            // Context of the app under test.
//            Context appContext = InstrumentationRegistry.getTargetContext();
//
//            assertEquals("com.example.allymcgilloway.eightball_start_code", appContext.getPackageName());
//        }

    @Test
    public void canCountWord(){
        assertEquals(3, word.CountWords("Sweet Leaf Salad"));
    }

    @Test
    public void canCountWordsMessage(){
        assertEquals("3 words entered", word.CountWordsMessage("Sweet Leaf Salad"));
    }

}
