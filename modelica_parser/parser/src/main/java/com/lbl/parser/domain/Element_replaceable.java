package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Element_replaceable {
    private String prefix;
    private Short_class_definition short_class_definition;
    private Component_clause1 component_clause1;
    private Constraining_clause constraining_clause;

    public Element_replaceable(String rep_dec,
                               Short_class_definition short_class_definition,
                               Component_clause1 component_clause1,
                               Constraining_clause constraining_clause) {
      this.prefix = rep_dec;
      this.short_class_definition = short_class_definition;
      this.component_clause1 = component_clause1;
      this.constraining_clause = (constraining_clause==null ? null : constraining_clause);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Element_replaceable aElement_replaceable = (Element_replaceable) o;
      if (prefix != null ? !prefix.equals(aElement_replaceable.prefix) : aElement_replaceable.prefix != null) return false;
      return (short_class_definition != null ? short_class_definition.equals(aElement_replaceable.short_class_definition) : aElement_replaceable.short_class_definition == null)
              || (component_clause1 != null ? component_clause1.equals(aElement_replaceable.component_clause1) : aElement_replaceable.component_clause1 == null)
              || (constraining_clause != null ? constraining_clause.equals(aElement_replaceable.constraining_clause) : aElement_replaceable.constraining_clause == null);
    }

    @Override
    public int hashCode() {
      int result = prefix != null ? prefix.hashCode() : 0;
      result = 31 * result + (short_class_definition != null ? short_class_definition.hashCode() : 0);
      result = 31 * result + (component_clause1 != null ? component_clause1.hashCode() : 0);
      result = 31 * result + (constraining_clause != null ? constraining_clause.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Element_replaceable{" +
             "\nprefix=" + prefix + '\'' +
             "\nshort_class_definition=" + short_class_definition + '\'' +
             "\ncomponent_clause1=" + component_clause1 + '\'' +
             "\nconstraining_clause=" + constraining_clause + '\'' +
             '}';
    }
}
