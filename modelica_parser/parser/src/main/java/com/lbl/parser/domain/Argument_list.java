package com.lbl.parser.domain;

import java.util.Collection;

/**
 * Created by JayHu on 07/21/2017
 */
public class Argument_list {
    private Collection<Argument> argument;

    public Argument_list(Collection<Argument> argument) {
      this.argument = (argument.size()>0 ? argument : null);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Argument_list aArgument_list = (Argument_list) o;
      return argument != null ? argument.equals(aArgument_list.argument) : aArgument_list.argument == null;
    }

    @Override
    public int hashCode() {
      int result = argument != null ? argument.hashCode() : 0;
      return result;
    }

    @Override
    public String toString() {
    	  return "Argument_list{" +
                  "\nargument=" + argument + '\'' +
                  '}';

      
    }
}
