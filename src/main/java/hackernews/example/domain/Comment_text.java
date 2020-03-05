package hackernews.example.domain;

import java.util.ArrayList;

public class Comment_text {
	 private String value;
	 private String matchLevel;
	 private boolean fullyHighlighted;
	 ArrayList < Object > matchedWords = new ArrayList < Object > ();


	 // Getter Methods 

	 public String getValue() {
	  return value;
	 }

	 public String getMatchLevel() {
	  return matchLevel;
	 }

	 public boolean getFullyHighlighted() {
	  return fullyHighlighted;
	 }

	 // Setter Methods 

	 public void setValue(String value) {
	  this.value = value;
	 }

	 public void setMatchLevel(String matchLevel) {
	  this.matchLevel = matchLevel;
	 }

	 public void setFullyHighlighted(boolean fullyHighlighted) {
	  this.fullyHighlighted = fullyHighlighted;
	 }
	}