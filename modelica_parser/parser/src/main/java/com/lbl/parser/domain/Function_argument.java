package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Function_argument {
    private Name name;
    private Named_arguments arguments;
    private Expression expressions;

    public Function_argument(String fun_dec,
    						 Name name,
                             Named_arguments named_arguments,
                             Expression expression) {
      this.name = name;
      this.arguments = named_arguments;
      this.expressions = expression;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Function_argument aFunction_argument = (Function_argument) o;
//      if (ident != null ? !ident.equals(aNamed_argument.ident) : aNamed_argument.ident != null) return false;
      return (name != null ? name.equals(aFunction_argument.name) : aFunction_argument.name == null)
            || (expressions != null ? expressions.equals(aFunction_argument.expressions) : aFunction_argument.expressions == null);
    }

    @Override
    public int hashCode() {
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + (arguments != null ? arguments.hashCode() : 0);
      result = 31 * result + (expressions != null ? expressions.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Function_argument{" +
              "\nname=" + name + '\'' +
              "\narguments=" + arguments + '\'' +
              "\nexpressions=" + expressions + '\'' +
              '}';
    }
}
