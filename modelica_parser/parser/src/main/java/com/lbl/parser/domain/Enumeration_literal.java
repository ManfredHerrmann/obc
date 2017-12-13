package com.lbl.parser.domain;


/**
 * Created by JayHu on 07/21/2017
 */
public class Enumeration_literal {
    private String name;
    private Comment comment;

    public Enumeration_literal(String ident,
                               Comment comment) {
      this.name = ident;
      this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Enumeration_literal aEnumeration_literal = (Enumeration_literal) o;
      if (name != null ? !name.equals(aEnumeration_literal.name) : aEnumeration_literal.name != null) return false;
      return comment != null ? comment.equals(aEnumeration_literal.comment) : aEnumeration_literal.comment == null;
    }

    @Override
    public int hashCode() {
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + (comment != null ? comment.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Enumeration_literal{" +
              "\nname=" + name + '\'' +
              "\ncomment=" + comment + '\'' +
              '}';
    }
}
