package com.lbl.parser.domain;

import java.util.Collection;

/**
 * Created by JayHu on 07/21/2017
 */
public class Equation_section {
    private String prefix;
    private Collection<Equation> equation;

    public Equation_section(String init_dec,
                            String equ_dec,
                            Collection<Equation> equation) {
      this.prefix = (init_dec==null ? "" : (init_dec + " ")) + " " + equ_dec;
      this.equation = (equation.size()>0 ? equation : null);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Equation_section aEquation_section = (Equation_section) o;
      if (prefix != null ? !prefix.equals(aEquation_section.prefix) : aEquation_section.prefix != null) return false;
      return equation != null ? equation.equals(aEquation_section.equation) : aEquation_section.equation == null;
    }

    @Override
    public int hashCode() {
      int result = prefix != null ? prefix.hashCode() : 0;
      result = 31 * result + (equation != null ? equation.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Equation_section{" +
    		 "\nprefix=" + prefix + '\'' +
             "\nequation=" + equation + '\'' +
             '}';
    }
}
