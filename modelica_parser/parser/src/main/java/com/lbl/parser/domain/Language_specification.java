package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Language_specification {
    private String language_specification;

    public Language_specification(String ident) {
      this.language_specification = ident;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Language_specification aLanguage_specification = (Language_specification) o;
      return language_specification != null ? language_specification.equals(aLanguage_specification.language_specification) 
    		  : aLanguage_specification.language_specification == null;
    }

    @Override
    public int hashCode() {
      int result = language_specification != null ? language_specification.hashCode() : 0;
      return result;
    }

    @Override
    public String toString() {
      return "Language_specification{" +
              "\nlanguage_specification=" + language_specification + '\'' +
              '}';
    }
}
