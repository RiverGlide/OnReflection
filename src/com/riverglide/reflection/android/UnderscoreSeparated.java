package com.riverglide.reflection.android;

public class UnderscoreSeparated {

	private static final String ON_EACH_CAPITAL_LETTER = "(?<!^)(?=[A-Z])";
	private final String phrase;
	
	public UnderscoreSeparated(String phrase) {
		this.phrase = underscoreSeparated(phrase);
	}

	private String underscoreSeparated(String phrase) {
		String[] words = phrase.split(ON_EACH_CAPITAL_LETTER);
	    StringBuffer result = new StringBuffer("");
	    
	    for (String word : words) {
	    	result.append(word.toLowerCase() + "_");
		}
	    
	    String underscoredPhrase = trimTrailingUnderscoreFrom(result);
	    return underscoredPhrase;
	}

	private String trimTrailingUnderscoreFrom(StringBuffer result) {
		String phrase = result.toString();
		return phrase.substring(0, lengthOfUseful(result));
	}

	private int lengthOfUseful(StringBuffer result) {
		return result.toString().length()-1;
	}

	@Override
	public String toString() {
		return phrase;
	}
	
	

}
