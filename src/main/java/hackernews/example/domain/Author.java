package hackernews.example.domain;

import java.util.ArrayList;

public class Author {
	 private String value;
	 private String matchLevel;
	 ArrayList < Object > matchedWords = new ArrayList < Object > ();


	 // Getter Methods 

	 public String getValue() {
	  return value;
	 }

	 public String getMatchLevel() {
	  return matchLevel;
	 }

	 // Setter Methods 

	 public void setValue(String value) {
	  this.value = value;
	 }

	 public void setMatchLevel(String matchLevel) {
	  this.matchLevel = matchLevel;
	 }
	}