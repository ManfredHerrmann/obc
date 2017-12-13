package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Component_declaration1 {
    private Declaration declaration;
    private Comment comment;

    public Component_declaration1(Declaration declaration,
                                  Comment comment) {
      this.declaration = declaration;
      this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Component_declaration1 aComponent_declaration1 = (Component_declaration1) o;
      if (declaration != null ? !declaration.equals(aComponent_declaration1.declaration) : aComponent_declaration1.declaration != null) return false;
      return comment != null ? comment.equals(aComponent_declaration1.comment) : aComponent_declaration1.comment == null;
    }

    @Override
    public int hashCode() {
      int result = declaration != null ? declaration.hashCode() : 0;
      result = 31 * result + (comment != null ? comment.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Component_declaration1{" +
              "\ndeclaration=" + declaration + '\'' +
              "\ncomment=" + comment + '\'' +
              '}';
    }
}
