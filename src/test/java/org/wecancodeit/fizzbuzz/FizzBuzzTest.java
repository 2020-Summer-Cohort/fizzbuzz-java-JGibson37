package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
1 Should say "1" X
2 Should Say "2"
3 Should say "Fizz"
4 Should say "4"
5 Should say "Buzz"
 */
public class FizzBuzzTest {
    @Test
    public void shouldInstantiate() {
        FizzBuzz underTest = new FizzBuzz();
    }

    @Test
    public void oneShouldSayOne() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(1);
        //assertion
        assertEquals("1", result);
    }

    @Test
    public void twoShouldSayTwo() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(2);
        //assertion
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSayFizz() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(3);
        //assertion
        assertEquals("Fizz", result);
    }

    @Test
    public void fourShouldSayFour() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(4);
        //assertion
        assertEquals("4", result);
    }

    @Test
    public void fiveShouldSayFive() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void sixShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(6);
        assertEquals("Fizz", result);
    }
    @Test
    public void nineShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(9);
        assertEquals("Fizz", result);
    }
    @Test
    public void elevenShouldSayBang() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(11);
        assertEquals("BANG", result);
    }
    @Test
    public void bothShouldSayFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(15);
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void threeAndElevenShouldSayFizzBANG() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(33);
        assertEquals("FizzBANG", result);
    }
}