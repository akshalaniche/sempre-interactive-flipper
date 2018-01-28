package edu.stanford.nlp.sempre.embeddings;

import java.io.Serializable;
import java.util.HashMap;

public class Dictionary implements Serializable {
	
	/**
   * 
   */
  private static final long serialVersionUID = -910722549301640487L;
  HashMap<String,Word> entries;
	
	public Dictionary(Reader r) {
		this.entries = r.getWords(); 
	}
}
