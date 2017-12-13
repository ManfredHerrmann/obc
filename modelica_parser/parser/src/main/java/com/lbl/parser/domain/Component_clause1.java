package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Component_clause1 {
    private Type_prefix type_prefix;
    private Type_specifier type_specifier;
    private Component_declaration1 component_declaration1;

    public Component_clause1(Type_prefix type_prefix,
                             Type_specifier type_specifier,
                             Component_declaration1 component_declaration1) {
      this.type_prefix = type_prefix;
      this.type_specifier = type_specifier;
      this.component_declaration1 = component_declaration1;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Component_clause1 aComponent_clause1 = (Component_clause1) o;
      if (type_prefix != null ? !type_prefix.equals(aComponent_clause1.type_prefix) : aComponent_clause1.type_prefix != null) return false;
      if (type_specifier != null ? !type_specifier.equals(aComponent_clause1.type_specifier) : aComponent_clause1.type_specifier != null) return false;
      return component_declaration1 != null ? component_declaration1.equals(aComponent_clause1.component_declaration1) : aComponent_clause1.component_declaration1 == null;
    }

    @Override
    public int hashCode() {
      int result = type_prefix != null ? type_prefix.hashCode() : 0;
      result = 31 * result + (type_specifier != null ? type_specifier.hashCode() : 0);
      result = 31 * result + (component_declaration1 != null ? component_declaration1.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Component_clause1{" +
              "\ntype_prefix=" + type_prefix + '\'' +
              "\ntype_specifier=" + type_specifier + '\'' +
              "\ncomponent_declaration1=" + component_declaration1 + '\'' +
              '}';
    }
}
