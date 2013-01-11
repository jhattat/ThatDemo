package com.oxit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzz1_is1() {
		assertThat(fizzBuzz(1), equalTo("1"));
	}

	@Test
	public void fizzBuzzz2_is2() {
		assertThat(fizzBuzz(2), equalTo("2"));
	}

	private String fizzBuzz(int i) {
		if(i == 1)
			return "1";
		return "2";
	}

}
