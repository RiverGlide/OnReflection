package com.riverglide.reflection.android;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class UnderscoreSeparatedShould {

	@Test
	public void giveUsALowerCaseSingleWordFromALowerCaseSingleWord() throws Exception {
		assertThat(new UnderscoreSeparated("hello").toString(), is("hello"));
	}
	
	@Test
	public void giveUsALowerCaseSingleWordFromACapitalisedSingleWord() throws Exception {
		assertThat(new UnderscoreSeparated("Hello").toString(), is("hello"));
	}
	
	@Test
	public void giveUsAnUnderscoreSeparatedPhraseForClassNames() throws Exception {
		assertThat(new UnderscoreSeparated("HelloWorld").toString(), is("hello_world"));
	}
	
	@Test
	public void giveUsAnUnderscoreSeparatedPhraseForVariableNames() throws Exception {
		assertThat(new UnderscoreSeparated("helloWorld").toString(), is("hello_world"));
	}
}
