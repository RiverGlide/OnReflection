package com.riverglide.reflection.android;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class UnderscoreConventionShould {

	@Test
	public void giveUsALowerCaseSingleWordFromALowerCaseSingleWord() throws Exception {
		assertThat(new UnderscoreConvention("hello").toString(), is("hello"));
	}
	
	@Test
	public void giveUsALowerCaseSingleWordFromACapitalisedSingleWord() throws Exception {
		assertThat(new UnderscoreConvention("Hello").toString(), is("hello"));
	}
	
	@Test
	public void giveUsAnUnderscoreSeparatedPhrase() throws Exception {
		assertThat(new UnderscoreConvention("HelloWorld").toString(), is("hello_world"));
	}
}
