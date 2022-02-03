package com.example.task1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public  void  addition_isNotCorrect() {
        assertEquals("Numbers isn't equals!", 5, 2+2);
    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest(){
        String str = null;
        assertTrue(str.isEmpty());
    }

}