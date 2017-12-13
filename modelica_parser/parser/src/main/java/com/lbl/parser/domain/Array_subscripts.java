package com.lbl.parser.domain;

import java.util.Collection;

/**
 * Created by JayHu on 07/21/2017
 */
public class Array_subscripts {
    private Collection<Subscript> subscript;

    public Array_subscripts(Collection<Subscript> subscript) {
      this.subscript = (subscript.size() > 0 ? subscript : null);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Array_subscripts aArray_subscripts = (Array_subscripts) o;
      return subscript != null ? subscript.equals(aArray_subscripts.subscript) : aArray_subscripts.subscript == null;
    }

    @Override
    public int hashCode() {
      int result = subscript != null ? subscript.hashCode() : 0;
      return result;
    }

    @Override
    public String toString() {
      return "Array_subscripts{" +
              "\nsubscript=" + subscript + '\'' +
              '}';
    }
}
