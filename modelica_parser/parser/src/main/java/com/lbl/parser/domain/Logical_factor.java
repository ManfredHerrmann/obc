package com.lbl.parser.domain;


/**
 * Created by JayHu on 07/21/2017
 */
public class Logical_factor {
    private String not;
    private Relation relation;

    public Logical_factor(String not_dec,
                          Relation relation) {
      this.not = not_dec;
      this.relation = relation;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Logical_factor aLogical_factor = (Logical_factor) o;
      return relation != null ? relation.equals(aLogical_factor.relation) : aLogical_factor.relation == null;
    }

    @Override
    public int hashCode() {
      int result = not != null ? not.hashCode() : 0;
      result = 31 * result + (relation != null ? relation.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Logical_factor{" +
              "\nnot=" + not + '\'' +
              "\nrelation=" + relation + '\'' +
              '}';
    }
}
