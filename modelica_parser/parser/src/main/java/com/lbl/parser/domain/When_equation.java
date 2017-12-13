package com.lbl.parser.domain;

import java.util.Collection;

/**
 * Created by JayHu on 07/21/2017
 */
public class When_equation {
    private Expression when;
    private Collection<Equation> when_then;
    private Collection<Expression> else_when;
    private Collection<Equation> else_then;

    public When_equation(Expression expression1,
                         Collection<Equation> equation1,
                         Collection<Expression> expression2,
                         Collection<Equation> equation2) {
      this.when = expression1;
      this.when_then = (equation1 != null ? equation1 : null);
      this.else_when = (expression2 != null ? expression2 : null);
      this.else_then = (equation2 != null ? equation2 : null);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      When_equation aWhen_equation = (When_equation) o;
      return (when != null ? when.equals(aWhen_equation.when) : aWhen_equation.when == null)
             && (when_then != null ? when_then.equals(aWhen_equation.when_then) : aWhen_equation.when_then == null);
    }

    @Override
    public int hashCode() {
      int result = when != null ? when.hashCode() : 0;
      result = 31 * result + (when_then != null ? when_then.hashCode() : 0);
      result = 31 * result + (else_when != null ? else_when.hashCode() : 0);
      result = 31 * result + (else_then != null ? else_then.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "When_equation{" +
              "\nwhen=" + when + '\'' +
              "\nthen=" + when_then + '\'' +
              "\nelse_when=" + else_when + '\'' +
              "\nthen=" + else_then + '\'' +
              '}';
    }
}
