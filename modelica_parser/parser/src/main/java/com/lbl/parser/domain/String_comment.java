package com.lbl.parser.domain;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by JayHu on 07/21/2017
 */
public class String_comment {
	private String string;
    //private Collection<String> string;

    public String_comment(Collection<String> str_dec) {
    	String nameString = "";
    	if (str_dec.size() == 0) {
    		nameString = null;
    	} else {
    		List<String> strList = new ArrayList<String>(str_dec);
    		if (str_dec.size() == 1) {
        		nameString = strList.get(0);
        	} else {
        		nameString = strList.get(0);
        		for (int i=1; i<str_dec.size(); i++) {
        			nameString = nameString + "+" + strList.get(i);
        		}
        	}
    		
    	}   	
      this.string = nameString;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      String_comment aString_comment = (String_comment) o;
      return string != null ? string.equals(aString_comment.string) : aString_comment.string == null;
    }

    @Override
    public int hashCode() {
      int result = string != null ? string.hashCode() : 0;
      return result;
    }

    @Override
    public String toString() {
      return "String_comment{" +
             "\nstring=" + string + '\'' +
             '}';     
    }
}
