package com.thoughtworks;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat("Fizz", equalTo(game.dealWithFirstRule(3)));
    }

    @Test
    public void should_return_FizzBuzz_when_have_15() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat("FizzBuzz", equalTo(game.dealWithSecondRule(15)));
    }

    @Test
    public void should_return_Fizz_when_have_13() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat("Fizz", equalTo(game.dealWithThirdRule(13)));
    }

    @Test
    public void totalTest() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertThat("FizzWhizz", equalTo(game.total(21)));
    }
}
